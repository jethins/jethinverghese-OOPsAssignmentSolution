package com.greatlearning.model;

public class TechDepartment extends SuperDepartment{
    // This class is to handle the Tech department

    String techStackInformation;

    public String departmentName(){
        departmentName="Welcome to Tech Department";
        return departmentName;
    }

    public String getTodaysWork(){
        todaysWork = "Complete coding of Module 1";
        return todaysWork;
    }

    public String getWorkDeadline(){
        workDeadline = "Complete by EOD";
        return workDeadline;
    }

    public String techStackInformation(){
        techStackInformation = "Core Java";
        return techStackInformation;
    }

    public String isTodayAHoliday(){
        todayAHoliday = super.isTodayAHoliday();
        return todayAHoliday;
    }

}
