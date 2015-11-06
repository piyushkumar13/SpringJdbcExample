package com.practice.assignments;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class EmployeeDoaImpl implements EmployeeDoa {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Employee> selectEmployee() {
        return (List<Employee>) jdbcTemplate.query("select * from employee", new ResultSetExtractor() {


            @Override
            public List<Employee> extractData(ResultSet rs) throws SQLException,
                    DataAccessException {

                List<Employee> list = new ArrayList<Employee>();
                while (rs.next()) {
                    Employee e = new Employee();
                    e.setId(rs.getInt(1));
                    e.setName(rs.getString(2));
                    e.setSalary(rs.getString(3));
                    list.add(e);
                }
                return list;
            }
        });

    }

    @Override
    public int insertEmployee(Employee e) {
        String query = "insert into employee values('" + e.getId() + "','"
                + e.getName() + "','" + e.getSalary() + "')";
        return jdbcTemplate.update(query);
    }

    @Override
    public int updatetEmployee(Employee e) {
        String query = "update employee set name='" + e.getName()
                + "',salary='" + e.getSalary() + "' where id='" + e.getId()
                + "' ";
        return jdbcTemplate.update(query);
    }

    @Override
    public int deleteEmployee(Employee e) {
        String query = "delete from employee where id='" + e.getId() + "' ";
        return jdbcTemplate.update(query);
    }

}
