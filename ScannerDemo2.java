import java.util.Scanner;
public class ScannerDemo2 {
  public static void main( String [] args ) {
    int data = 0; // integer value to be input
    int total = 0; // total sum of integers
    // create a Scanner object
    Scanner input = new Scanner( System.in );
    // prompt user to enter data
    System.out.println( "Enter 1 or more integers." );
    System.out.println( "To end input type: " );
    System.out.println( "CTL-Z (for Windows)" );
    System.out.println( "CTL-D (for Mac/Linux)" );
    // read data until user indicates done
    while ( input.hasNext() ) {
      data = input.nextInt();
      total += data;
    }
    // Display the output
    System.out.println( "The sum is " + total );
  }
}
