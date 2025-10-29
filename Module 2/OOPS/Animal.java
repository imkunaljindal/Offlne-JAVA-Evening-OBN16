public class Animal {

    String name;
    int legs;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal construtor is called");
    }


    void walk() {
        System.out.println("Animal is walking");
    }
}
