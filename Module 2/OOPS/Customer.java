public class Customer {

    String name;
    int age;
    String email;

    Customer() {

    }

    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void sayHello() {
        System.out.println("Hello my name is "+name);
    }
}
