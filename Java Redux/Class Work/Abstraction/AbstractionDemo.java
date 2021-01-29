package Abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
       // Employee e = new Employee("George W.", "Houston, TX", 43);
      // System.out.println("\n Call mailCheck using Employee reference--");
        Salary s = new Salary("Vanessa Kasun", "Omaha, NE", 3, 75000.00);
        EmployeeDemo e = new Salary("Jon Larsen", "Omaha, NE", 4, 95000.00);
        System.out.println("Call mailCheck using Salary reference--");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
    }
}
