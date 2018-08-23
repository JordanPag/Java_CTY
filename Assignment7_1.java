import java.util.Scanner;
public class Assignment7_1 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("\nEnter a weight on Earth in pounds: ");
    double earthWeight = input.nextDouble();
    double marsWeight = weightEarthToMars(earthWeight);
    double moonWeight = weightEarthToMoon(earthWeight);
    System.out.println("\nWeight on Mars: " + marsWeight + " pounds. Weight on the Moon: " + moonWeight + " pounds.");

    System.out.print("\nEnter a weight on Mars in pounds: ");
    marsWeight = input.nextDouble();
    earthWeight = weightMarsToEarth(marsWeight);
    System.out.println("\nWeight on Earth: " + earthWeight + " pounds.");

    System.out.print("\nEnter a weight on the Moon in pounds: ");
    moonWeight = input.nextDouble();
    earthWeight = weightMoonToEarth(moonWeight);
    System.out.println("\nWeight on Earth: " + earthWeight + " pounds.\n");
  }
  public static double weightEarthToMars(double earthWeight) {
    double marsWeight = (earthWeight / 9.81) * 3.711;
    return marsWeight;
  }
  public static double weightEarthToMoon(double earthWeight) {
    double moonWeight = (earthWeight / 9.81) * 1.622;
    return moonWeight;
  }
  public static double weightMoonToEarth(double moonWeight) {
    double earthWeight = (moonWeight / 1.622) * 9.81;
    return earthWeight;
  }
  public static double weightMarsToEarth(double marsWeight) {
    double earthWeight = (marsWeight / 3.711) * 9.81;
    return earthWeight;
  }
}
