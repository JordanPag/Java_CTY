public class Card {
  private int value;
  private int suit;
  public Card(int v, int s) {
    value = v;
    if(value == 0) {
      value = 13;
    }
    suit = s;
  }
  public String getCardLabel() {
    String[] vals = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    String val = vals[value-1];
    String[] suits = {"diamonds", "hearts", "spades", "clubs"};
    String s = suits[suit];
    return val + " of " + s;
  }
  public int getValue() {
    return value;
  }
  public int getSuit() {
    return suit;
  }
}
