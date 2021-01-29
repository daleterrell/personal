package Abstraction;

public abstract class EmployeeDemo {
        private String name;
        private String address;
        private int number;
    
        public EmployeeDemo(String name, String address, int number) {
            System.out.println("Constructing an Employee");
            this.name = name;
            this.address = address;
            this.number = number;
        }
    
        public double computePay() {
            System.out.println("Inside Employee computePay");
            return 0.0;
        }
        public void mailCheck() {
            System.out.println("Mailing a check to " + this.name + " " + this.address);
        }
        public String toString () {
            return name + " " + address + " " + number;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public String getAddress() {
            return address;
        }
    
        public void setAddress(String address) {
            this.address = address;
        }
    
        public int getNumber() {
            return number;
        }
    
        public void setNumber(int number) {
            this.number = number;
        }
        
    }