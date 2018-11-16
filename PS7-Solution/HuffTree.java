import java.util.HashMap;

public class HuffTree implements Comparable<HuffTree> {

  Node top;
  int size;
  HashMap<Integer, String> huffcodes = new HashMap<Integer, String>();

  public class Node {
    Node rchild;
    Node lchild;
    int weight;
    int character;

    public Node (Node lchild, Node rchild, int weight) {
      this.lchild = lchild;
      this.rchild = rchild;
      this.weight = weight;
    }

    public Node (int weight, int character) {
      this.weight = weight;
      this.character = character;
    }

    public Node() {
      rchild = null;
      lchild = null;
      weight = 0;
      character = -1;
    }
  }

  public HuffTree() {
    this.top = new Node();
  }

  public HuffTree(int character, int weight) {
    Node newnode = new Node(weight, character);
    this.top = newnode;
  }

  public int compareTo(HuffTree other) {
    if (this.top.weight > other.top.weight) {
      return 1;
    } else if (this.top.weight == other.top.weight) {
	     return 1;
    } else {
      return -1;
    }
  }

  public void mergeTrees(HuffTree left, HuffTree right) {
    Node newparent = new Node(left.top, right.top, (left.top.weight + right.top.weight));
    int newsize = left.size + right.size;
    this.top = newparent;
    this.size = newsize + 1;

  }

  public String printTree(Node n, String s) {
    if (n == null) {
      return s;
    }
    if (n.rchild == null && n.lchild == null) {
	    System.out.println(s + " " + n.weight + " "  +(char) n.character);
      huffcodes.put(n.character, s);
      return s;
    }
    if (n.lchild != null) {
      String news = s + "0";
      printTree(n.lchild, news);
    }
    if (n.rchild != null) {
      String news = s + "1";
      printTree(n.rchild, news);
    }
    return s;
  }

  public void printMe() {
      System.out.println(printTree(top, ""));
  }

}
