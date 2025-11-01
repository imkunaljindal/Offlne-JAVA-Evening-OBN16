package Abstraction;

public class JavaCourse implements Course{

    public void getCourseName() {
        System.out.println("Java Course");
    }

    public int calculateFees(int numberOfStudents) {
        return numberOfStudents*1000;
    }

    public int fun() {

    }

}
