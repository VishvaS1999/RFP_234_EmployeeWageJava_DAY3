package com.EmployeeWageDay3;

public class CalculatingWagesForMonth_UC5
{
    public static void main(String[] args)
    {
        //constants
        final int IS_PART_TIME = 1;
        final int IS_FULL_TIME = 2;
        final int EMP_RATE_PER_HOUR = 20;
        final int NUM_OF_WORKING_DAYS = 20;

        //variables
        int empHrs = 0, empWage = 0, totalEmpWage = 0;

        //computation
        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++)
        {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck)
            {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;

                case IS_FULL_TIME:
                    empHrs = 8;
                    break;

                default:
                    empHrs = 0;
            }
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage = totalEmpWage + empWage;
            System.out.println("Employee Wage is : " + empWage);
        }
        System.out.println("Employee Total Wage is : " + totalEmpWage);
    }
}
