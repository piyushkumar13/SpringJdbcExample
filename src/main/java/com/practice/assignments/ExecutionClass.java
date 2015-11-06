package com.practice.assignments;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.List;

public class ExecutionClass {

	public static void main(String[] args) {
		int i ;
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e=(Employee)app.getBean("employee");
		
		EmployeeDoaImpl emp=(EmployeeDoaImpl)app.getBean("emp1");
		List<Employee> list=emp.selectEmployee();
		
		Iterator<Employee> itr=list.iterator();
		while(itr.hasNext()){
			
			System.out.println("The value is "+itr.next());
		}
		
		i=emp.insertEmployee(e);
		if(i>0){

			System.out.println("Upadated successfully");

		}
		i=emp.deleteEmployee(e);
		if(i>0){
			System.out.println("deleted successfully");
		}

		i=emp.updatetEmployee(e);
		if(i>0){
			System.out.println("updated successfully");
			
		}
		System.out.println("succeeded");
	}

}
