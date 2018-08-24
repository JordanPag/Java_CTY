import java.util.Scanner;
public class Project2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Deck deck = new Deck(52);
    Deck temp = new Deck(52);
    Card hand[] = new Card[2];
    int hand_total = 0;
    Card dealer_hand[] = new Card[2];
    int dealer_total = 0;
    boolean playAgain = true;
    boolean stay = false;
    int wins = 0;
    int losses = 0;

    // Start of game
    while(playAgain) {
      System.out.println();
      deck.shuffle(temp.getCards());
      for(int i = 0; i < 2; i++) {
        hand[i] = deck.draw();
        dealer_hand[i] = deck.draw();
      }
      displayHand(hand);
      System.out.println("Dealer's hand: " + dealer_hand[0].getCardLabel() + " and an unknown card");
      hand_total = getCardTotal(hand);
      System.out.println("Your hand total is " + hand_total);
      while(hand_total < 21 && stay == false) {
        System.out.print("Hit or stay? ");
        String hitOrStay = sc.nextLine();
        if(hitOrStay.toLowerCase().equals("hit")) {
          hand = addCard(hand, deck.draw());
          hand_total = getCardTotal(hand);
          displayHand(hand);
          System.out.println("Your hand total is " + hand_total);
        } else if(hitOrStay.toLowerCase().equals("stay")) {
          stay = true;
        } else {
          System.out.println(hitOrStay + " is not a valid input");
        }
      }
      stay = false;
      if(hand_total == 21) {
        System.out.println("Blackjack! You win!");
        wins ++;
      } else if(hand_total > 21) {
        System.out.println("Busted! You lose!");
        losses ++;
      } else {
        dealer_total = getCardTotal(dealer_hand);
        while(dealer_total < 17) {
          dealer_hand = addCard(dealer_hand, deck.draw());
          dealer_total = getCardTotal(dealer_hand);
        }
        System.out.print("\nDealer hand:");
        for(int i = 0; i < dealer_hand.length; i++) {
          System.out.print(" " + dealer_hand[i].getCardLabel());
          if(dealer_hand.length > 2 && i + 1 < dealer_hand.length) {
            System.out.print(",");
          }
          if(i + 2 == dealer_hand.length) {
            System.out.print(" and");
          } else if(i + 1 == dealer_hand.length) {
            System.out.println();
          }
        }
        System.out.println("Dealer total is " + dealer_total);
        if(dealer_total > 21) {
          dealer_total = 0;
        }
        if(dealer_total >= hand_total) {
          System.out.println("You lose!");
          losses ++;
        } else {
          System.out.println("You win!");
          wins ++;
        }
      }
      boolean validInput = false;
      while(!validInput) {
        System.out.print("\nWould you like to play again? y/n: ");
        String playAgainString = sc.nextLine();
        if(playAgainString.equals("y")) {
          validInput = true;
          hand = new Card[2];
          dealer_hand = new Card[2];
          dealer_total = 0;
        } else if(playAgainString.equals("n")) {
          validInput = true;
          playAgain = false;
        } else {
          System.out.println(playAgainString + " is not a valid input");
        }
      }
    }
    System.out.println("\nYour record: " + wins + "-" + losses);

    System.out.println();
  }
  public static void displayHand(Card hand[]) {
    System.out.print("Your hand:");
    for(int i = 0; i < hand.length; i++) {
      System.out.print(" " + hand[i].getCardLabel());
      if(hand.length > 2 && i + 1 < hand.length) {
        System.out.print(",");
      }
      if(i + 2 == hand.length) {
        System.out.print(" and");
      } else if(i + 1 == hand.length) {
        System.out.println();
      }
    }
  }
  public static Card[] addCard(Card hand[], Card card) {
    Card new_hand[] = new Card[hand.length + 1];
    for(int i = 0; i < hand.length; i++) {
      new_hand[i] = hand[i];
    }
    new_hand[hand.length] = card;
    return new_hand;
  }
  public static int getCardTotal(Card hand[]) {
    int hand_total = 0;
    int value;
    int aceCount = 0;
    for(int i = 0; i < hand.length; i++) {
      value = hand[i].getValue();
      if(value >= 10) {
        hand_total += 10;
      } else if(value == 1) {
        hand_total += 11;
        aceCount++;
      } else {
        hand_total += value;
      }
    }
    for(int i = 0; i < aceCount; i++) {
      if(hand_total <= 21) {
        break;
      } else {
        hand_total -= 10;
      }
    }
    return hand_total;
  }
}
