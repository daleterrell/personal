package Encapsulation;

public class RunEncap {
    public static void main(String args[]) {
        EncapTest encap = new EncapTest();
        encap.setName("Vanessa");
        encap.setAge(26);
        encap.setIdNum("12343ms");
  
        System.out.println("Name : " + encap.getName() + " Age : " + encap.getAge());
     }
}
