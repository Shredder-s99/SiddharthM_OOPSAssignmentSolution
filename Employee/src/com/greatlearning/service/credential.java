package com.greatlearning.service;

import com.greatlearning.model.employee;

import java.util.Random;

public class credential extends employee {
	private String pswd = new String();
	private String alphabets = "abcdefghijklmnopqrstuvwxyz";
	private String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String special = "!@#$%^&*()/*";
	private String email = new String();

	void generatePassword()
	{

		Random random = new Random();
		pswd = pswd + random.nextInt(500);
		pswd = pswd + alphabets.charAt(random.nextInt(alphabets.length()));
		pswd = pswd + caps.charAt(random.nextInt(caps.length()));
		pswd = pswd + special.charAt(random.nextInt(special.length()));
		while(pswd.length()<=8)
		{
			pswd = pswd + caps.charAt(random.nextInt(caps.length()));
		}
		//return pswd;
	}
	void generateEmailAddress(employee L1,String selection, String Company)
	{

		email = L1.getFname()+L1.getLname()+"@"+selection+".companycom";

	}
	void showPassword(employee L1)
	{
		System.out.println("Dear "+L1.getFname()+"your generated credentials are as follows");
		System.out.println("Email -->"+email);
		System.out.println("Password -->"+pswd);
	}
	credential(String lname,String fname)
	{
		super(fname,lname);
	}

}
