import java.util.Scanner;
public class Assignment7_2 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("\nEnter the loan in dollars: ");
    int loan = input.nextInt();
    System.out.print("Enter the annual interest rate percentage: ");
    double interest = (input.nextDouble() / 100) / 12;
    System.out.print("Enter the length of the term in years: ");
    double time = input.nextDouble() * 12;

    double monthlyPayment = calculateMonthlyPayment(loan, interest, time);
    java.text.DecimalFormat df = new java.text.DecimalFormat( "#####.##" );
    System.out.println("\nYour monthly payment is: $" + df.format(monthlyPayment));
  }
  public static double calculateMonthlyPayment(int l, double r, double n) {
    double monthlyPayment = (r * l) / (1 - Math.pow(1 + r, -n));
    return monthlyPayment;
  }
}
