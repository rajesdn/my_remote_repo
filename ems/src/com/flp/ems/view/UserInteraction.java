package com.flp.ems.view;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.flp.ems.domain.Employee;

public class UserInteraction {
	
	Employee obj2=new Employee();
	Scanner sc=new Scanner(System.in);
	private Map<Integer, String> employee= new HashMap<>();
	
	private int emp_id=1234;
	
	
	public void AddEmployee(){
		
		emp_id++;
		UserInteraction obj =new UserInteraction();
		obj2.setName("Rajesh");
		obj2.setPhone_no("9952969011");
		obj2.setAdd("8/265 Gandhinagar");
		obj2.setJ_date("30/05/2016");
		obj2.setdateofbirth("19/08/1995");
		
		employee.put(new Integer(1),obj2.getName());
		employee.put(new Integer(2),obj2.getPhone_no());
		employee.put(new Integer(3),obj2.getAdd());
		employee.put(new Integer(4),obj2.getJ_date());
		employee.put(new Integer(5),obj2.getdateofbirth());
		
		
		
	}
	public void ModifyEmployee(){
		//UserInteraction obj =new UserInteraction();
		System.out.println(" Employee detail  is : ");
		
		System.out.println("Enter the employee Details of the Employee with ID: "+ emp_id);
		
		for( Entry<Integer, String> e: employee.entrySet()){
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}
	public void RemoveEmployee(){
		
	}
	public int SearchEmployee(){
		return 0;
	}
	public int getAllEmployee(){
		return 0;
	}

}
