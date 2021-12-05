package com.greatlearning.driver;

import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HrDepartment;
import com.greatlearning.model.TechDepartment;

public class Departments {

    public static void main(String args[]){

        String deptName, todaysWork, workDeadline, activity, techStackInformation, todayHoliday;

        // Admin Department Handler
        AdminDepartment adminDepartment = new AdminDepartment();
        deptName = adminDepartment.departmentName();
        todaysWork = adminDepartment.getTodaysWork();
        workDeadline = adminDepartment.getWorkDeadline();
        todayHoliday = adminDepartment.isTodayAHoliday();
        System.out.println(deptName);
        System.out.println(todaysWork);
        System.out.println(workDeadline);
        System.out.println(todayHoliday);
        System.out.println();

        // HR Department Handler
        HrDepartment hrDepartment = new HrDepartment();
        deptName = hrDepartment.departmentName();
        activity = hrDepartment.doActivity();
        todaysWork = hrDepartment.getTodaysWork();
        workDeadline = hrDepartment.getWorkDeadline();
        todayHoliday = hrDepartment.isTodayAHoliday();
        System.out.println(deptName);
        System.out.println(activity);
        System.out.println(todaysWork);
        System.out.println(workDeadline);
        System.out.println(todayHoliday);
        System.out.println();

        // Tech Department Handler
        TechDepartment techDepartment = new TechDepartment();
        deptName = techDepartment.departmentName();
        todaysWork = techDepartment.getTodaysWork();
        workDeadline = techDepartment.getWorkDeadline();
        techStackInformation = techDepartment.techStackInformation();
        todayHoliday = techDepartment.isTodayAHoliday();
        System.out.println(deptName);
        System.out.println(todaysWork);
        System.out.println(workDeadline);
        System.out.println(techStackInformation);
        System.out.println(todayHoliday);
    }
}
