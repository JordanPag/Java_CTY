public class Date {
  private int day;
  private int month;
  private int year;

  public Date(int m, int d, int y) {
    month = m;
    day = d;
    year = y;
  }

  public String displayDate() {
    return month + "/" + day + "/" + year;
  }
}
