package FinalConcept;

public class Concept {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.salary = 1000;
        Employee.numberOfEmployees++;

        Employee e2 = new Employee();
        e2.salary = 1500;
        Employee.numberOfEmployees++;

        Employee.sayHelloStatic();

        System.out.println(Employee.numberOfEmployees);

    }
}
