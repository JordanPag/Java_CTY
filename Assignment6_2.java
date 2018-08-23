public class Assignment6_2 {
  public static void main(String[] args) {
    int maxStars = 10;
    int starNum = 0;
    for(int i = 0; i <= maxStars; i++) {
      starNum = maxStars - i;
      for(int j = 0; j <= i; j++) {
        System.out.print(" ");
      }
      for(int k = 0; k <= starNum; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
