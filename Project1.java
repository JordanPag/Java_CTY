import java.util.Scanner;
public class Project1 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nWould you like to encode or decode a message?");
    boolean validInput = false;
    String input = "";
    int encodeDecode = 0;
    while(!validInput) {
      System.out.print("Type \"encode\" to encode a message and \"decode\" to decode a message: ");
      input = sc.nextLine();
      if(input.equals("encode")) {
        encodeDecode = 1;
        validInput = true;
      } else if(input.equals("decode")) {
        encodeDecode = 2;
        validInput = true;
      } else {
        System.out.println(input + " is not a valid input");
      }
    }
    System.out.print("\nEnter the message you would like to " + input + ": ");
    String message = sc.nextLine();
    StringBuffer result = new StringBuffer();
    if(encodeDecode == 1) {
      result = encode(message);
    } else {
      result = decode(message);
    }
    System.out.println("\nYour " + input + "d message is " + result);
  }
  public static StringBuffer encode(String message) {
    StringBuffer result = new StringBuffer();
    for(int i = 0; i < message.length(); i++) {
      switch(message.substring(i, i + 1)) {
        case "a":
          result.append("z");
          break;
        case "b":
          result.append("y");
          break;
        case "c":
          result.append("x");
          break;
        case "d":
          result.append("w");
          break;
        case "e":
          result.append("v");
          break;
        case "f":
          result.append("u");
          break;
        case "g":
          result.append("t");
          break;
        case "h":
          result.append("s");
          break;
        case "i":
          result.append("r");
          break;
        case "j":
          result.append("q");
          break;
        case "k":
          result.append("p");
          break;
        case "l":
          result.append("o");
          break;
        case "m":
          result.append("n");
          break;
        case "n":
          result.append("m");
          break;
        case "o":
          result.append("l");
          break;
        case "p":
          result.append("k");
          break;
        case "q":
          result.append("j");
          break;
        case "r":
          result.append("i");
          break;
        case "s":
          result.append("h");
          break;
        case "t":
          result.append("g");
          break;
        case "u":
          result.append("f");
          break;
        case "v":
          result.append("e");
          break;
        case "w":
          result.append("d");
          break;
        case "x":
          result.append("c");
          break;
        case "y":
          result.append("b");
          break;
        case "z":
          result.append("a");
          break;
        case "A":
          result.append("Z");
          break;
        case "B":
          result.append("Y");
          break;
        case "C":
          result.append("X");
          break;
        case "D":
          result.append("W");
          break;
        case "E":
          result.append("V");
          break;
        case "F":
          result.append("U");
          break;
        case "G":
          result.append("T");
          break;
        case "H":
          result.append("S");
          break;
        case "I":
          result.append("R");
          break;
        case "J":
          result.append("Q");
          break;
        case "K":
          result.append("P");
          break;
        case "L":
          result.append("O");
          break;
        case "M":
          result.append("N");
          break;
        case "N":
          result.append("M");
          break;
        case "O":
          result.append("L");
          break;
        case "P":
          result.append("K");
          break;
        case "Q":
          result.append("J");
          break;
        case "R":
          result.append("I");
          break;
        case "S":
          result.append("H");
          break;
        case "T":
          result.append("G");
          break;
        case "U":
          result.append("F");
          break;
        case "V":
          result.append("E");
          break;
        case "W":
          result.append("D");
          break;
        case "X":
          result.append("C");
          break;
        case "Y":
          result.append("B");
          break;
        case "Z":
          result.append("A");
          break;
        default:
          result.append(message.substring(i, i + 1));
      }
    }
    return result;
  }
  public static StringBuffer decode(String message) {
    StringBuffer result = encode(message);
    return result;
  }
}
