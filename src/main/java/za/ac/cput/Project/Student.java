package za.ac.cput.Project;

public  abstract class Student {
    protected final String studentID;
    protected final String name;
    protected final String email;
    protected final String department;

    public Student(String studentID, String name, String email, String department) {
        this.studentID = studentID;
        this.name = name;
        this.email = email;
        this.department = department;
    }



    public abstract double calculateTuition();
    public abstract String getStudentType();

    public void displayStudentDetails(){}

    @Override
    public abstract String toString();
}
