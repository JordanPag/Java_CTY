import java.util.Scanner;
public class Assignment4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("\nEnter the first test score: ");
    int score1 = input.nextInt();

    System.out.print("\nEnter the second test score: ");
    int score2 = input.nextInt();

    System.out.print("\nEnter the third test score: ");
    int score3 = input.nextInt();

    double avg = (double)(score1 + score2 + score3) / 3D;
    String grade;

    if(avg >= 97.5) {
      grade = "A+";
    } else if(avg >= 93.5) {
      grade = "A";
    } else if(avg >= 89.5) {
      grade = "A-";
    } else if(avg >= 86.5) {
      grade = "B+";
    } else if(avg >= 82.5) {
      grade = "B";
    } else if(avg >= 79.5) {
      grade = "B-";
    } else if(avg >= 69.5) {
      grade = "C";
    } else {
      grade = "F";
    }

    System.out.println("\nAverage is " + avg + ". Grade is " + grade + ".\n");
  }
}
