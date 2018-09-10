public class DemoStatic {

  // Class demonstrating static vs. instance methods

  void sayHello() {
    System.out.println("Hello!");
  }

  static void sayHelloStatic() {
    System.out.println("Hello (static)!");
  }

  public static void main (String[] args) {

    // To call the static method you don't
    // need to create an instances of the class.
    sayHelloStatic();

    // To call the instance method, you need
    // to create an instance of the class.
    DemoStatic ds = new DemoStatic();
    ds.sayHello();
  }

}
