public class Superhero {
  private Name name;
  private boolean suitOn;
  private boolean capeOn;
  private Date birthdate;
  private boolean usingPowers;

  public Superhero(Name n, boolean s, boolean c, Date b, boolean u) {
    name = n;
    suitOn = s;
    capeOn = c;
    birthdate = b;
    usingPowers = u;
  }

  public void usePowers() {
    if(usingPowers == true) {
      System.out.println(name.getNickname() + " is already using their powers");
    } else {
      usingPowers = true;
      System.out.println(name.getNickname() + " is now using their powers");
    }
  }
  public void stopUsingPowers() {
    if(usingPowers == false) {
      System.out.println(name.getNickname() + " is not using their powers anyway");
    } else {
      usingPowers = false;
      System.out.println(name.getNickname() + " has now stopped using their powers");
    }
  }

  public void putOnSuit() {
    suitOn = true;
  }
  public void takeOffSuit() {
    suitOn = false;
  }
  public void putOnCape() {
    capeOn = true;
  }
  public void takeOffCape() {
    capeOn = false;
  }

  public Name getName() {
    return name;
  }
  public boolean getSuitBool() {
    return suitOn;
  }
  public boolean getCapeBool() {
    return capeOn;
  }
  public Date getBirthdate() {
    return birthdate;
  }
  public boolean getPowersBool() {
    return usingPowers;
  }
}
