public class Dog {
  private String name;
  private String breed;
  private String gender;
  private int age;
  private int weight;
  private boolean hasFleas;

  public Dog(String n, String b, String g, int a, int w) {
    name = n;
    breed = b;
    gender = g;
    age = a;
    weight = w;
    hasFleas = false;
  }

  public Dog(String n, String b, String g, int a, int w, boolean h) {
    name = n;
    breed = b;
    gender = g;
    age = a;
    weight = w;
    hasFleas = h;
  }

  public void eat() {
    System.out.println("Chomp chomp chomp");
  }

  public void bark() {
    System.out.println("Woof woof woof");
  }

  public void scratchFleas() {
    if(hasFleas == true) {
      System.out.println("Scratch scratch scratch");
      hasFleas = false;
    } else {
      System.out.println(name + " does not have any fleas");
    }
  }

  public String getName() {
    return name;
  }

  public String getBreed() {
    return breed;
  }

  public String getGender() {
    return gender;
  }

  public int getAge() {
    return age;
  }

  public int getWeight() {
    return weight;
  }

  public boolean getHasFleas() {
    return hasFleas;
  }
}
