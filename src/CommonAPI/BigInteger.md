* ```BigInteger```是一个用于处理大整数的类，它可以处理任意大小的整数，而不会丢失精度。
* 在Java中，整数有四种类型，分别是byte、short、int和long.
    * 二进制01111111 第一位是0，代表是正数
    * 二进制11111111 第一位是1，代表是负数
* 但是，这四种类型的整数都有一个共同的特点，就是它们的取值范围是有限的，而且在某些情况下，可能会丢失精度。
    * 例如，如果我们要计算两个很大的整数的乘积，那么我们可能会得到一个超出long类型的取值范围的结果。
    * 这时，我们就需要使用BigInteger类来处理这种情况。
* BigInteger类是一个不可变的类，它提供了一系列的方法来处理大整数的运算，例如加法、减法、乘法、除法等。
    * 使用方法：
      1.构造方法：```public BigInteger(int num, Random rnd)```获取级大整数，范围是 $ [0, 2^{num}-1] $ .
    * 