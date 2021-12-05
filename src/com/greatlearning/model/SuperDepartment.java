package com.greatlearning.model;

public class SuperDepartment {

    String departmentName;
    String todaysWork;
    String workDeadline;
    String todayAHoliday;

    SuperDepartment(){
        departmentName = "Super Department";
        todaysWork = "No Work as of now";
        workDeadline = "Nil";
        todayAHoliday = "Today is not a holiday";
    }

    public String departmentName() {
        return departmentName;
    }

    public String getTodaysWork() {
        return todaysWork;
    }

    public String getWorkDeadline() {
        return workDeadline;
    }

    public String isTodayAHoliday() {
        return todayAHoliday;
    }

}
