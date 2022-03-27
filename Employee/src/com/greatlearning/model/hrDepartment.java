package com.greatlearning.model;

public class hrDepartment extends superDepartment {
	@Override
	public String departmentName(){
		return "Hr Department";
	}
	@Override
	public String getTodaysWork(){
		return "Fill today’s worksheet and mark your attendance";
	}
	@Override
	public String getWorkDeadline(){
		return "Complete by EOD";
	}
	public String doActivity(){
		return "team Lunch";
	}
}
