import java.util.Scanner;
public class Assignment5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean validWeight = false;
    double weight;
    while(!validWeight) {
      System.out.print("\nPlease enter the weight of the package in pounds: ");
      weight = input.nextDouble();
      if(weight <= 0) {
        System.out.println("\nThe weight must be greater than 0");
      } else if(weight > 20) {
        System.out.println("\nThe package is too heavy to be shipped");
      } else {
        validWeight = true;
        String price;
        if(weight > 10) {
          price = "$12.50";
        } else if(weight > 3) {
          price = "$9.45";
        } else if(weight > 1) {
          price = "$4.95";
        } else {
          price = "$2.95";
        }
        System.out.println("\nThe shipping cost is " + price + ".\n");
      }
    }
  }
}
