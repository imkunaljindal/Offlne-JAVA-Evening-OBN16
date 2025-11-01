package Abstraction;

public class MernCourse implements Course{
    @Override
    public void getCourseName() {
        System.out.println("MERN Course");
    }

    @Override
    public int calculateFees(int numberOfStudents) {
        return numberOfStudents*800;
    }
}
