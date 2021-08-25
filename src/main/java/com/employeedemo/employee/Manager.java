package com.employeedemo.employee;

import java.util.Date;

/*
    Left 'partTimeFlag' and did not override as, for all we know, it could be McDonald's, and they have 16-year-old
    part-time managers
*/

public class Manager extends EmployeeAlt {

    public void Employee(String name, Date dateHired, int id, boolean partTimeFlag, boolean managerFlag) {
        super.Employee();
    }

    public boolean isManagerFlag() {
        return true;
    }
}
