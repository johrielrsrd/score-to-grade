import java.util.Scanner;

public class ScoreToGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter score: ");
        int score = scan.nextInt();
        scan.close();

        if (score >= 90)
            System.out.println("You got an A grade!");
        else if (score <= 89 && score >= 80)
            System.out.println("You got a B grade!");
        else if (score <= 79 && score >= 70)
            System.out.println("You got a C grade!");
        else if (score <= 69 && score >= 60)
            System.out.println("You got a D grade!");
        else
            System.out.println("You got an F grade!");
    }
}
