package com.greatlearning.model;

public class techDepartment extends superDepartment{
	@Override
	public String departmentName(){
		return "Tech Department";
	}
	@Override
	public String getTodaysWork(){
		return "Complete Codig Module 1";
	}
	@Override
	public String getWorkDeadline(){
		return "Complete by EOD";
	}
	public String getTechStackInformation(){
		return "Core Java";
	}
}
