public class Elephant extends Animal {
    int eyes;

    private Elephant(String name) {
        super(name);
        this.name = "abc";
        System.out.println("Elephant constructor is called");
    }

    void run() {
        System.out.println("Elephant is running");
    }
}
