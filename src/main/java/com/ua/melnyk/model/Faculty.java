package com.ua.melnyk.model;

public class Faculty {

    private int id;
    private String name;
    private int budgetquantity;
    private int totalamount;

    public int getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(int totalamount) {
        this.totalamount = totalamount;
    }

    public Faculty(){}

    public Faculty(int id, String name, int budgetquantity, int totalamount) {
        this.id = id;
        this.name = name;
        this.budgetquantity = budgetquantity;
        this.totalamount=totalamount;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudgetquantity() {
        return budgetquantity;
    }

    public void setBudgetquantity(int budgetquantity) {
        this.budgetquantity = budgetquantity;
    }
}
