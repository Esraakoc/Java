package com.mycompany.firstcase;

public class Employee {

    //constructor
    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //constructor
    public Employee() {

    }

    private String name; //adı ve soyadı
    private double salary;//maaşı
    private double workHours; //haftalık çalışma saati
    private int hireYear;//İşe başlangıç yılı

    //get, set methodları
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    //vergi
    public double tax() {
        if (salary > 1000) {
            return (salary * (3.0) / 100);
        } else {
            return 0;
        }
    }

    //40 saat üstü çalışma süresi
    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30.0 * 4; //4 Hafta üzerinden hesaplandı 
        } else {
            return 0;
        }
    }

    //çalışma yılına göre maaş artışı
    public double raiseSalary() {
        int totalYear = 2021 - hireYear;

        if (totalYear <= 9) {
            return (salary * (5.0) / 100);
        } else if (totalYear >= 10 && totalYear < 20) {
            return (salary * (10.0) / 100);
        } else {
            return (salary * (15.0) / 100);
        }
    }

    //Net Maaş
    public double totalSalary() {
        return salary + raiseSalary() + bonus() - tax();
    }

    public void toString1() {
        System.out.println("Çalışanın Adı ve Soyadı : " + getName()
                + "\nMaaşı : " + getSalary()
                + "\nÇalışma saati : " + getWorkHours()
                + "\nBaşlangıç yılı : " + getHireYear()
                + "\nVergi : " + tax() + ", Bonus : " + bonus() + ", Maaş artışı : " + raiseSalary()
                + "\nVergi ve bonuslarla birlikte Net maaş : " + totalSalary() + "\n\n");
    }
}
