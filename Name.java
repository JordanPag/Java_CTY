public class Name {
  private String firstName;
  private String lastName;
  private String nickname;
  public Name(String f, String l) {
    firstName = f;
    lastName = l;
    nickname = "";
  }
  public Name(String f, String l, String c) {
    firstName = f;
    lastName = l;
    nickname = c;
  }

  public String getNickname() {
    return nickname;
  }
  public String getFirstName() {
    return firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public String getFullName() {
    return firstName + " " + lastName;
  }
}
