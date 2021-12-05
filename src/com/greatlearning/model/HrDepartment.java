package com.greatlearning.model;

public class HrDepartment extends SuperDepartment {
    // This class is to handle the HR department

    String activity;

    public String departmentName(){
        departmentName="Welcome to HR Department";
        return departmentName;
    }

    public String getTodaysWork(){
        todaysWork = "Fill today’s timesheet and mark your attendance";
        return todaysWork;
    }

    public String getWorkDeadline(){
        workDeadline = "Complete by EOD";
        return workDeadline;
    }

    public String doActivity(){
        activity = "team Lunch";
        return activity;
    }

    public String isTodayAHoliday(){
        todayAHoliday = super.isTodayAHoliday();
        return todayAHoliday;
    }

}
