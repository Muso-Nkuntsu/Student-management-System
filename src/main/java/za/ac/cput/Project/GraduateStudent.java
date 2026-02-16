package za.ac.cput.Project;

import java.util.StringJoiner;

public class GraduateStudent extends Student {

    private final boolean researchAssistant;
    private final double stipend;

    private GraduateStudent(Builder builder) {
        super(builder.studentId, builder.name, builder.email, builder.department);
        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
    }

    @Override
    public double calculateTuition() {
        double baseTuition = 25000;

        if (researchAssistant) {
            return baseTuition - stipend;
        }
        return baseTuition;
    }

    @Override
    public String getStudentType() {
        return "Graduate Student";
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "GraduateStudent{", "}");

        joiner.add("studentId='" + studentID + "'");
        joiner.add("name='" + name + "'");

        if (department != null) {
            joiner.add("department='" + department + "'");
        }
        if (email != null) {
            joiner.add("email='" + email + "'");
        }

        joiner.add("researchAssistant=" + researchAssistant);
        joiner.add("stipend=" + stipend);
        joiner.add("tuition=" + calculateTuition());

        return joiner.toString();
    }

    public static class Builder {

        private final String studentId;
        private final String name;

        private String email;
        private String department;
        private boolean researchAssistant;
        private double stipend;

        public Builder(String studentId, String name) {
            this.studentId = studentId;
            this.name = name;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Builder researchAssistant(boolean researchAssistant) {
            this.researchAssistant = researchAssistant;
            return this;
        }

        public Builder stipend(double stipend) {
            this.stipend = stipend;
            return this;
        }

        public GraduateStudent build() {
            return new GraduateStudent(this);
        }
    }
}
