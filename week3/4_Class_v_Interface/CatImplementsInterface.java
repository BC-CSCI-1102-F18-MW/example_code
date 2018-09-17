
public class CatImplementsInterface implements AnimalInterface {

  // Need to define all the methods in the interface
  public String gasNeeds = "oxygen";

  public String getGasNeeds() {
    return this.gasNeeds;
  }
  public void talk() {
    System.out.println("Meow");
  }
  public boolean canMove() {
    return true;
  }

  public static void main (String[] args) {
    CatImplementsInterface myCat = new CatImplementsInterface();
    myCat.talk();
  }

}
