package Score;

import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        int score = scanIn.nextInt();
        scanIn.close();

        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("You grade is " + grade);
    }
}
