package com.greatlearning.model;
public class employee {
	private String fname = new String();
	private String lname = new String();
	employee()
	{

	}



	public employee(String fname, String lname) {
		this.fname = fname;
		this.lname= lname;
	}

	public String getFname()
	{
		return fname;
	}
	public String getLname()
	{
		return lname;
	}


}
