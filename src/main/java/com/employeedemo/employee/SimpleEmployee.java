package com.employeedemo.employee;

import java.util.Date;

public class SimpleEmployee {
    private boolean managerFlag;

    private String name;

    private Date dateHired;

    private int id;

    // new flag for if employee is part-time
    private boolean partTimeFlag;

    // Default constructor assuming most employees are full-time, non-managers.
    public void Employee() {
        this.managerFlag = false;
        this.name = "";
        this.dateHired = new Date();;
        this.id = 0;
        this.partTimeFlag = false;
    }

    public void Employee(boolean managerFlag, String name, Date dateHired, int id, boolean partTimeFlag) {
        this.managerFlag = managerFlag;
        this.name = name;
        this.dateHired = dateHired;
        this.id = id;
        this.partTimeFlag = partTimeFlag;
    }

    public boolean isManagerFlag() {
        return managerFlag;
    }

    public void setManagerFlag(boolean managerFlag) {
        this.managerFlag = managerFlag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPartTimeFlag() {
        return partTimeFlag;
    }

    public void setPartTimeFlag(boolean partTimeFlag) {
        this.partTimeFlag = partTimeFlag;
    }
}
