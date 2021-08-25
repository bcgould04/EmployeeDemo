package com.employeedemo.employee;

import java.util.Date;

public class PartTimeEmployee extends EmployeeAlt {

    public void Employee(String name, Date dateHired, int id, boolean partTimeFlag) {
        super.Employee();
    }

    @Override
    public boolean isPartTimeFlag() {
        return true;
    }
}
