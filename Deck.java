import java.util.Random;
public class Deck {
  private Card cards[];
  private int size;
  private int drawIndex = 0;
  public Deck(int s) {
    size = s;
    cards = new Card[size];
    for(int i = 0; i < size; i++) {
      int value = (i + 1) % 13;
      int suit = (i / 13) % 4;
      cards[i] = new Card(value, suit);
    }
  }
  // For testing
  public void displayOrder() {
    for(int i = 0; i < size; i++) {
      System.out.println(cards[i].getCardLabel());
    }
  }
  public Card[] getCards() {
    return cards;
  }
  public void shuffle(Card temp[]) {
    drawIndex = 0;
    Random randomNum = new Random();
    int indexArray[] = new int[size];
    for(int i = 0; i < size; i++) {
      indexArray[i] = i;
    }
    for(int j = size; j > 0; j--) {
      int removeIndex = randomNum.nextInt(j);
      cards[indexArray[removeIndex]] = temp[52-j];
      for(int i = removeIndex; i < j - 1; i++) {
        indexArray[i] = indexArray[i + 1];
      }
    }
  }
  public Card draw() {
    drawIndex ++;
    Card card = cards[drawIndex - 1];
    if(drawIndex == size - 1) {
      Card temp[] = new Card[size];
      for(int i = 0; i < size; i++) {
        int value = (i + 1) % 13;
        int suit = (i / 13) % 4;
        temp[i] = new Card(value, suit);
      }
      shuffle(temp);
    }
    return card;
  }
}
