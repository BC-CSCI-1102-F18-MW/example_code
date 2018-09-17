// file: StringStack.java
// author: Bob Muller
//
// An API for simple stacks of Strings.
//
public interface StringStack {
  
  public void push(String s);
  public String pop();
  public String peek();
  public boolean isEmpty();
  public String toString();
}
