package com.fdmgroup.SOLIDExercises;

/* the idea in this Exercise is to redesign a given class structure 
to something adhering the SOLID Principles
I Will Write the given UML in here and create the redesigned class below

Account
--------------------------------------
-hasOverdraft
-hasInterestPayment
-hasInterestCharge
-accountNumber
-accountName
-balance
-PIN
-------------------------------------
// getter and setter methods 

-----> the pin should definitely not be here
------> has overdraft is already contained in the balance
----> has interest payment or has interest charge are also part of the same information

*/
public class Account {
private boolean hasOverdraft;
private boolean hasInterestPayment;
private boolean hasInterestCharge;
private int accountNumber;
private String accountName;
private double balance;
private int PIN; //maybe even short?

}
