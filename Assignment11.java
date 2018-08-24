public class Assignment11 {
  public static void main(String[] args) {
    System.out.println();
    Superhero hero1 = new Superhero(new Name("Bruce", "Wayne", "Batman"), true, true, new Date(6, 23, 1939), false);
    Superhero hero2 = new Superhero(new Name("Clark", "Kent", "Superman"), false, false, new Date(4, 18, 1938), false);
    Superhero hero3 = new Superhero(new Name("Diana", "Prince", "Wonder Woman"), true, false, new Date(3, 22, 1941), true);
    Superhero heroes[] = {hero1, hero2, hero3};
    for(int i = 0; i < heroes.length; i++) {
      Superhero hero = heroes[i];
      System.out.println("Hero " + (i + 1));
      System.out.println("Name: " + hero.getName().getNickname() + ". Also known as " + hero.getName().getFullName());
      System.out.println("Birthdate: " + hero.getBirthdate().displayDate());
      System.out.println("Cape on: " + hero.getCapeBool());
      System.out.println("Suit on: " + hero.getSuitBool());
      System.out.println("Using powers: " + hero.getPowersBool());
      hero.usePowers();
      System.out.println();
    }
  }
}
