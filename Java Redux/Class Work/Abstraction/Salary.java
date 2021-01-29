package Abstraction;

public class Salary extends EmployeeDemo {
    private double salary; //Annual Salary

    public double computePay(){
        System.out.println("Computing Salary Pay For " + getName());
        return salary/52;
    }

    public Salary(String name, String address, int number, double salary){
        super(name, address, number);
        setSalary(salary);
    }
    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName() + " with salary " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if(newSalary >= 0.0 ){
            salary = newSalary;
        }
    }
    }
