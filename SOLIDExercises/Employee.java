package com.fdmgroup.SOLIDExercises;

import java.util.List;

/* the idea in this Exercise is to redesign a given class structure 
to something adhering the SOLID Principles
I Will Write the given UML in here and create the redesigned class below

Employee
--------------------------------------------
-employeeId: int
-employeeName: String
-salary: double
--------------------------------------------
+addEmployee(employee: Employee)
+removeEmployee(employeeId:int)
+updateEmployee(employee:Employee)
+listEmployees(): List<Employee> 


In this exercise you need to redesign the classes to allow a list of employees to be
maintained using all the above methods. Make sure your solution adheres to
SOLID principles. 

----------> the methods should not be in the same Class as the Employee 
------------attributes according to the Single Responsibility Principle

*/
public class Employee {
private int employeeID;
private String employeeName;
private double salary;

public void addEmployee(Employee employee) {
	// makes no sense to be in this class
}

public void removeEmployee(int employeeID) {
	//makes no sense to be here
}

public void updateEmployee(Employee employee) {
	// makes no sense to be here
}

public List<Employee> listEmployees(){
	//why would this be here
	return null;
}
}
