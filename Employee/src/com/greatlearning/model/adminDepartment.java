package com.greatlearning.model;

public class adminDepartment extends  superDepartment{
	@Override
	public String departmentName(){
		return "Admin Department";
	}
	@Override
	public String getTodaysWork(){
		return "Complete your documents submission";
	}
	@Override
	public String getWorkDeadline(){
		return "Complete by EOD";
	}
	/* public String isTodayAHoliday(){
		return super.isTodayAHoliday();
	} */
}
