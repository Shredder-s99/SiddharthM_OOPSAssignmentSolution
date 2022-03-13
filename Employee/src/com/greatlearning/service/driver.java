package com.greatlearning.service;

import com.greatlearning.model.employee;

import java.util.Scanner;

public class driver {
	public static void main(String[] args)
	{
		String companyName = "abc";
		credential l1 = new credential("Siddharth","Mohankumar");
		int option;
		String selection =new String();
		Scanner get = new Scanner(System.in);
		System.out.println("Please enter the department from the following \n 1. Technical \n 2. Admin \n 3. Human Resource \n 4."
				+ "Legal");
		do {
          option = get.nextInt();
		  if(option <1 || option >4)
		  {
			  System.out.println("Please enter a valid input");
		  }
		}while(option <1 || option >4);
		if(option == 1)
		{
			selection = "technical";
		}
		else if(option == 2)
		{
			selection = "admin";
		}
		else if(option == 3)
		{
			selection = "hr";
		}
		else
		{
			selection = "legal";
		}
		l1.generatePassword();
		l1.generateEmailAddress(l1,selection,companyName);
		l1.showPassword(l1);
	}
}
