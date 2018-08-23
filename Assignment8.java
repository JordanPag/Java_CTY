public class Assignment8 {
  public static void main(String[] args) {
    int array_1[] = new int[100];
    for(int i = 0; i < 100; i++) {
      int number = 1 + (int)(Math.random() * 100);
      array_1[i] = number;
    }
    int multiplesOfFour[] = getMultiplesOfFour(array_1);
    int oddMultiplesOfFour[] = getOddMultiplesOfFour(multiplesOfFour);
    System.out.println("\nMultiples of four:");
    for(int i = 0; i < multiplesOfFour.length; i++) {
      System.out.println(multiplesOfFour[i]);
    }
    System.out.println("\nOdd multiples of four:");
    for(int i = 0; i < oddMultiplesOfFour.length; i++) {
      System.out.println(oddMultiplesOfFour[i]);
    }
  }
  public static int[] getMultiplesOfFour(int array[]) {
    int newArray[] = new int[array.length];
    int size = 0;
    for(int i = 0; i < array.length; i++) {
      if(array[i] % 4 == 0) {
        newArray[size] = array[i];
        size++;
      }
    }
    int returnArray[] = new int[size];
    for(int i = 0; i < size; i++) {
      returnArray[i] = newArray[i];
    }
    return returnArray;
  }
  public static int[] getOddMultiplesOfFour(int array[]) {
    int newArray[] = new int[array.length];
    int size = 0;
    for(int i = 0; i < array.length; i++) {
      if(array[i] % 8 == 4) {
        newArray[size] = array[i];
        size++;
      }
    }
    int returnArray[] = new int[size];
    for(int i = 0; i < size; i++) {
      returnArray[i] = newArray[i];
    }
    return returnArray;
  }
}
