package kap1.ProgU1_2;

import java.util.InputMismatchException;

public class EmployeeSalary {

    private int empNumber;
    private int empHourSalary;
    private int empWeeklyHours;

    public EmployeeSalary(int empNumber){
        this.empNumber = empNumber;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public int getEmpHourSalary() {
        return empHourSalary;
    }

    public void setEmpHourSalary(int empHourSalary) {
        if (empHourSalary>0) {
            this.empHourSalary = empHourSalary;
        } else {
            throw new InputMismatchException("The hour salary must be positive");
        }
    }

    public int getEmpWeeklyHours() {
        return empWeeklyHours;
    }

    public void setEmpWeeklyHours(int empWeeklyHours) {
        if (empWeeklyHours>0) {
            this.empWeeklyHours = empWeeklyHours;
        } else {
            throw new InputMismatchException("The weekly time must be positive");
        }
    }
}
