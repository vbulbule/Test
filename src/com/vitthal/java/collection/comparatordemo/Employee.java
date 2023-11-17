package com.vitthal.java.collection.comparatordemo;

public class Employee {
    int empID,salary,yearsOfExperience;
    String empName,department;

    public Employee(int empID, int salary, int yearsOfExperience, String empName, String department) {
        this.empID = empID;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
        this.empName = empName;
        this.department = department;
    }

    @Override
    public String toString() {
        return empID + " "+empName+" "+salary+" "+yearsOfExperience+ " "+department;
    }
}
