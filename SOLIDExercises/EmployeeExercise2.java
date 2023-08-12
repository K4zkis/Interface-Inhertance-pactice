package com.fdmgroup.SOLIDExercises;

/* the idea in this Exercise is to redesign a given class structure 
to something adhering the SOLID Principles
I Will Write the given UML in here and create the redesigned class below

Employee
----------------------------------------------------
-employeeId
-employeeName
-salary
---------------------------------------------------
+add(manager: Manager)
+add(director: Director)
+add(commissionWorker: CommissionWorker)
+add(salariedWorker: SalariedWorker)
---------------------------------------------------
// getter and setter methods 

----- > terrible method names? they are overloading each other;
-----> manager makes somewhat sense to be connected to the employee but 
the employee should probably then be in the manager class
------> same with director
------> comissionWorker and SalariedWorker would be subclasses of the employee class nonsense to add here

*/


public class EmployeeExercise2 {
private int employeeID;
private String employeeName;
private double salary;

public void addManager(Manager manager) {
	
}
public void addDirector(Director director) {
	
}
public void addComissionWorker(ComissionWorker comissionWorker) {
	
}
public void addSalariedWorker(SalariedWorker salariedWorker) {
	
}
}
