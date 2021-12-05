package com.greatlearning.model;

public class AdminDepartment extends SuperDepartment {

    // This class is to handle the Admin department
    public String departmentName(){
        departmentName="Welcome to Admin Department";
        return departmentName;
    }

    public String getTodaysWork(){
        todaysWork = "Complete your documents Submission";
        return todaysWork;
    }

    public String getWorkDeadline(){
        workDeadline = "Complete by EOD";
        return workDeadline;
    }

    public String isTodayAHoliday(){
        todayAHoliday = super.isTodayAHoliday();
        return todayAHoliday;
    }

}
