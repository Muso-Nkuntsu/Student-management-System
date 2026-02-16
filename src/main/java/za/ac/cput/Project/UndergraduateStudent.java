package za.ac.cput.Project;
import java.util.StringJoiner;

public class UndergraduateStudent extends Student {
    protected int creditHours;
    protected double scholarshipAmount;

    private UndergraduateStudent(Builder builder) {
        super(builder.studentID, builder.name, builder.email, builder.department);
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;

    }

    @Override
    public double calculateTuition() {
        double costPerCredit = 1500;
        return (creditHours * costPerCredit) - scholarshipAmount;
    }

    @Override
    public String getStudentType() {
        return "undergraduate Student";
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "Undergraduate Student{", "}");


        joiner.add("studentID: " + studentID);
        joiner.add("Name: " + name);
        if (department != null) {
            joiner.add("Department: " + department);
        }
        if (email != null) {
            joiner.add("Email: " + email);
        }
        joiner.add("creditHours :" + creditHours);
        joiner.add("Scholarship Amount: " + scholarshipAmount);
        joiner.add("Tuition: " + calculateTuition());

        return joiner.toString();

}
        public static class Builder{
            private  String studentID, name, email, department;
            private int creditHours;
            private double scholarshipAmount;

            public Builder(String studentID, String name, String email, String department) {
                this.studentID = studentID;
                this.name = name;
                this.email = email;
                this.department = department;
            }
            public Builder(String studentID, String name){
                this.studentID = studentID;
                this.name = name;
            }
            public Builder email(String email){
                this.email = email;
                return this;
            }
            public Builder department(String department){
            this.department = department;
            return this;
            }
        }

            public Builder setCreditHours(int creditHours) {
                this.creditHours = creditHours;
                return this;
            }

            public Builder setScholarshipAmount(double scholarshipAmount) {
                this.scholarshipAmount = scholarshipAmount;
                return scholarshipAmount;
            }
            public UndergraduateStudent build(){
                return new UndergraduateStudent(this);
            }

}
