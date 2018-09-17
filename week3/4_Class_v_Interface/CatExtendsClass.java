public class CatExtendsClass extends AnimalClass {

  // When extended a class, you can override a method from the superclass.
  public void talk() {
    System.out.println("Meow");
  }

  public static void main (String args[]) {
    CatExtendsClass mycat = new CatExtendsClass();
    mycat.talk();
  }
}
