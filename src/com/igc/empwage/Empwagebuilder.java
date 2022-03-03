package com.igc.empwage;

import java.util.Random;

public class Empwagebuilder {
    public static void main(String[] args) {

        //wellcome sms for user
        System.out.println("Welcome To The Employee Wage Problem Developed By Pradnyesh Wagh");
        //UC-2 Calculate Per Day Wage
        final int WAGE_PER_HR = 20;
        final int FULL_DAY_HR = 8;
        int totalWage = 0;
        Random random = new Random();
        int emp =random.nextInt()%2;

        //Uc-1 Check Employee Attendance
        System.out.println(emp);
        if (emp==0){
            System.out.println("Employee Is Absent:");
            totalWage = 0;
        }else{
            System.out.println("Employee Is Present:");
            totalWage = WAGE_PER_HR * FULL_DAY_HR;
        }
        System.out.println("Total Wage:="+totalWage);
    }

}
