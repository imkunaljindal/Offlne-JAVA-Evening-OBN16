package practice;

public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3,5);
        c1.print();

        ComplexNumber c2 = new ComplexNumber(4,6);

        c2.subtract(c1); //7 + 11i
        c2.print();
    }
}
