import java.util.Scanner;
public class RtoLicencePune {
    void checkEligibility() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 18) {
            int wait = 18 - age;
            System.out.println("Candidate is not eligible for licence.");
            System.out.println("Wait for " + wait + " years for licence.");
        } 
        else if (age > 75) {
            System.out.println("Candidate is not eligible for licence.");
        } 
        else if (age > 18 && age <= 75) {
            System.out.println("Candidate is eligible for licence.");
        } 
        else {
            System.out.println("Candidate is exactly 18 years old.");
            System.out.println("As per condition above 18, candidate is not eligible.");
        }

        sc.close();
    }

    public static void main(String[] args) {

        RtoLicencePune obj = new RtoLicencePune();
        obj.checkEligibility();

    }
}
