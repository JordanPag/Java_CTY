public class Assignment10 {
  public static void main(String[] args) {
    Dog dog1 = new Dog("Fido", "unknown", "male", 15, 11);
    Dog dog2 = new Dog("Spot", "beagle", "female", 10, 20, true);
    System.out.println("\nDog 1: Name: " + dog1.getName() + ". Breed: " + dog1.getBreed() + ". Gender: " + dog1.getGender() + ". Age: " + dog1.getAge() + " months. Weight: " + dog1.getWeight() + " pounds. Has fleas: " + dog1.getHasFleas() + ".");
    dog1.eat();
    dog1.bark();
    dog1.scratchFleas();
    System.out.println("\nDog 2: Name: " + dog2.getName() + ". Breed: " + dog2.getBreed() + ". Gender: " + dog2.getGender() + ". Age: " + dog2.getAge() + " months. Weight: " + dog2.getWeight() + " pounds. Has fleas: " + dog2.getHasFleas() + ".");
    dog2.bark();
    dog2.eat();
    dog2.scratchFleas();
    dog2.scratchFleas();
    System.out.println();
  }
}
