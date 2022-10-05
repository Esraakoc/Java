package com.mycompany.firstcase;

public class FirstCase {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Esra Koç", 3000, 40, 2009);

        Employee employee2 = new Employee("Ayşe Yılmaz", 900, 48, 2020);

        Employee employee3 = new Employee();
        employee3.setName("Mehmet Şahin");
        employee3.setSalary(2000);
        employee3.setWorkHours(45);
        employee3.setHireYear(2017);

        Employee employee4 = new Employee();
        employee4.setName("Ali Kaya");
        employee4.setSalary(4000);
        employee4.setWorkHours(50);
        employee4.setHireYear(2000);

        employee1.toString1();
        employee2.toString1();
        employee3.toString1();
        employee4.toString1();
    }
}
