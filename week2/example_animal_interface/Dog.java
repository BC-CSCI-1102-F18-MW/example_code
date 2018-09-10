public class Dog implements Animal {
  public void talk() {
    System.out.println("Bow wow!");
  }

  public static void main (String[] args) {
    Animal d = new Dog();
    d.talk();

  }
}
