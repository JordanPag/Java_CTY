import java.util.Scanner;
public class Assignment9 {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("\nEnter a sentence: ");
    String sentence = input.nextLine();
    boolean validInput = false;
    int inputNum;
    int returnNum = 0;
    String returnString = "";
    while(!validInput) {
      System.out.print("\nEnter 1 to count characters, 2 to count words: ");
      inputNum = input.nextInt();
      if(inputNum == 1) {
        validInput = true;
        returnNum = getLength(sentence);
        returnString = "characters";
      } else if(inputNum == 2) {
        validInput = true;
        returnNum = getWords(sentence);
        returnString = "words";
      } else {
        System.out.println(inputNum + " is not a valid input");
      }
    }
    System.out.println("\nThere are " + returnNum + " " + returnString + " in the sentence");
  }
  public static int getWords(String sentence) {
    String trim = sentence.trim();
    if (trim.isEmpty())
        return 0;
    return trim.split("\\s+").length;
  }
  public static int getLength(String sentence) {
    return sentence.length();
  }
}
