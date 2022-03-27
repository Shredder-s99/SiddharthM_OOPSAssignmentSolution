package com.greatlearning.service;

import com.greatlearning.model.adminDepartment;
import com.greatlearning.model.hrDepartment;
import com.greatlearning.model.superDepartment;
import com.greatlearning.model.techDepartment;

public class driver {
	public static void main(String[] args)
	{
		adminDepartment admin = new adminDepartment();
		hrDepartment hr = new hrDepartment();
		superDepartment s1= new superDepartment();
		techDepartment tech = new techDepartment();
		System.out.println(admin.welcomeString()+" "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println(hr.welcomeString()+" "+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println(tech.welcomeString()+" "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		System.out.println(s1.welcomeString()+" "+s1.departmentName());
		System.out.println(s1.getTodaysWork());
		System.out.println(s1.getWorkDeadline());
		System.out.println(s1.isTodayAHoliday());
	}
}
