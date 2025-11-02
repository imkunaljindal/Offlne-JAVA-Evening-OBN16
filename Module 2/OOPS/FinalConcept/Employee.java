package FinalConcept;

public class Employee {

    static int numberOfEmployees;
    int salary;
    final String companyName = "Acciojob";

//    public Employee() {
//        this.companyName = "Acciojob";
//    }

    public final void sayHello() {
        System.out.println("Hello from Employee");
    }

    public static void sayHelloStatic() {
        System.out.println("Hello static from Employee");
    }
}
