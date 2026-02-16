//231223722
//Muso Nkuntsu

package za.ac.cput.Project;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student undergrad = new UndergraduateStudent.Builder("23122387", "Muso")
                .email("Musotuks@gmail.com")
                .department("Computer Science")
                .creditHours(18)
                .scholarshipAmount(5000)
                .build();

        Student graduate = new GraduateStudent.Builder("G201", "Sarah")
                .email("sarah@uni.com")
                .department("Engineering")
                .researchAssistant(true)
                .stipend(10000)
                .build();

        System.out.println(undergrad);
        System.out.println();
        System.out.println(graduate);
    }
}
