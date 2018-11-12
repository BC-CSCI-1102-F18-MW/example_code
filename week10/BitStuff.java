public class BitStuff {
  public static void main (String[] args) {

    int a = 10;   // 1010 in binary (preceded by lots of zeros)
    int b = 15;   // 1111 in binary (preceded by lots of zeros)


    /* | the OR operator

      1010
    | 1111
    _______
      1111    15 in decimal
    */
    int result = a | b;
    System.out.format("%d | %d = %d\n", a, b, result);


    /* & the AND operator

      1010
    & 1111
    _______
      1010   10 in decimal
    */
    result = a & b;
    System.out.format("%d & %d = %d\n", a, b, result);

    /* ^ the XOR operator

      1010
    & 1111
    _______
      0101   5 in decimal
    */
    result = a ^ b;
    System.out.format("%d ^ %d = %d\n", a, b, result);

    /* ~ is the complement operator.
    It flips each bit so 0 becomes 1 and 1 becomes 0...
    ... except we are talking about ints in Java, and in Java
     the very first bit is the sign bit: positive (0) or negative (1).

    ~ in Java yields the "2's complement"
    This means it flips each bit and then adds 1.
    The output is add one to your current number and swap the sign.
    Example below.
    */

    result = ~a;
    System.out.format("2's complement of %d is %d\n", a, result);

    result = ~b;
    System.out.format("2's complement of %d is %d\n", b, result);


    int shiftnum = 212; // binary 11010100
    /*

    << 1 will give you 110101000, which is 424
    << 2 will give you 1101010000, which is 848
    */

    shiftnum = 212; // binary 11010100
    /*
    >> 1 will give you 1101010, which is 106
    >> 2 will give you 110101, which is 53

    */

  }

}
