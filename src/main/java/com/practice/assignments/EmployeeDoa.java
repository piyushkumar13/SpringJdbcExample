package com.practice.assignments;

import java.util.List;

public interface EmployeeDoa {

    List<Employee> selectEmployee();
	int insertEmployee(Employee e);
	int updatetEmployee(Employee e);
	int deleteEmployee(Employee e);
}
