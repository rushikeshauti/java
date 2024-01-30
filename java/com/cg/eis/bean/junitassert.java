package com.cg.eis.bean;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cg.eis.exception.EmployeeException;

public class junitassert {

	
@Test
public void test() {
	
    try {
        validateSalary(25000);  
    } catch (EmployeeException e) {
        System.out.println(e.getMessage());
      
    }
}

private static void validateSalary(double salary) throws EmployeeException {
    if (salary < 3000) {
        throw new EmployeeException("Salary cannot be below 3000");
    }else {
    	   System.out.println("Salary is above 3000");
    }
   
   // assertEquals("Salary cannot be below 3000",);
}}
