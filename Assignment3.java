import java.util.Scanner;
public class Assignment3 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("\nEnter a temperature in degrees farenheit: ");
    int farenheitDegs = input.nextInt();
    double kelvinDegs = ((farenheitDegs - 32) / 1.8) + 273.0;
    System.out.println("\nKelvin temperature: " + kelvinDegs + "\n");
  }
}
