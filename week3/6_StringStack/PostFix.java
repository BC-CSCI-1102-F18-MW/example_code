public class PostFix {

  public static void main (String[] args) {
    StringStackC ss = new StringStackC();

    String expression = "4 5 7 2 + + +";
    String[] tokens = expression.split("\\s+");

    for (String t : tokens) {
      if (!t.equals("*") && !t.equals("+") && !t.equals("/") && !t.equals("-")) {
        ss.push(t);
      } else {
        Double d1 = Double.parseDouble(ss.pop());
        Double d2 =  Double.parseDouble(ss.pop());
        Double result = 0.0;
        if (t.equals("+")) {
          result = d1 + d2;
        } else {
          result = d2 - d1;
        }
        ss.push(result.toString());
      }
    }
    System.out.println(ss.pop());

  }

}
