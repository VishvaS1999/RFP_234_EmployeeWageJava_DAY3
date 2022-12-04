package com.EmployeeWageDay3;

public class TotalWorkingDayOrHours_UC6
{
    public static void main(String[] args)
    {
        //constants
        final int IS_PART_TIME=1;
        final int IS_FULL_TIME=2;
        final int EMP_RATE_PER_HOUR=20;
        final int NUM_OF_WORKING_DAYS=20;
        final int MAX_HRS_PER_MONTH=100;

        //variables
        int empHrs=0, totalEmpHrs=0, totalWorkingDays=0;

        //Computation
        while (totalEmpHrs <= MAX_HRS_PER_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
        {
            totalWorkingDays++;
            int empCheck=(int)Math.floor(Math.random()*10)%3;
            switch (empCheck)
            {
                case IS_PART_TIME:
                    empHrs=4;
                    break;

                case IS_FULL_TIME:
                    empHrs=8;
                    break;
                default:
                    empHrs=0;
            }
            totalEmpHrs=totalEmpHrs+empHrs;
            System.out.println("Day : " +totalWorkingDays+ " Emp Hr : " +empHrs);
        }
        int totalEmpWage = totalEmpHrs*EMP_RATE_PER_HOUR;
        System.out.println("Total Employee Hours Wage is : " +totalEmpWage);
    }
}
