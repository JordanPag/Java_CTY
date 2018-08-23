import java.util.Scanner;
public class Assignment6_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("\nThis program calculates the sum of the integers in a range that are divisible by 3");
    System.out.print("\nEnter an upper bound for the range: ");
    int bound = input.nextInt();
    int numsDivisibleBy3 = 0;
    int sumOfNumsDivisibleBy3 = 0;
    int numsNotDivisibleBy3 = 0;
    int sumOfNumsNotDivisibleBy3 = 0;
    for(int i = 1; i <= bound; i++) {
      if(i % 3 == 0) {
        numsDivisibleBy3++;
        sumOfNumsDivisibleBy3 += i;
      } else {
        numsNotDivisibleBy3++;
        sumOfNumsNotDivisibleBy3 += i;
      }
    }

    System.out.println("\n" + numsDivisibleBy3 + " numbers in the range 1 - " + bound + " are divisible by 3. Their sum is " + sumOfNumsDivisibleBy3);
    System.out.println(numsNotDivisibleBy3 + " numbers in the range 1 - " + bound + " are not divisible by 3. Their sum is " + sumOfNumsNotDivisibleBy3 + "\n");
  }
}
