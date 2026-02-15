package za.ac.cput.Project;

public  abstract class Student {
    protected String studentID;
    protected String name;
    protected String email;
    protected String department;

    public abstract double calculateTuition();
    public abstract String getStudentType();

    public void displayStudentDetails(){}
}
