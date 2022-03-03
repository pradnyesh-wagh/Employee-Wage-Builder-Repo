package com.igc.empwage;

import java.util.Random;

public class Empwagebuilder {
    public static void main(String[] args) {

        //wellcome sms for user
        System.out.println("Well come To The Employee Wase Problem Devloped By Pradnyesh Wagh");
        Random random = new Random();
        int emp =random.nextInt()%2;

        //Uc-1
        System.out.println(emp);
        if (emp==0){
            System.out.println("Employee Is Absent:");
        }else{
            System.out.println("Employee Is Present:");
        }
    }

}
