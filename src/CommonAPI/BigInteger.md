* ```BigInteger```是一个用于处理大整数的类，它可以处理任意大小的整数，而不会丢失精度。
* 在Java中，整数有四种类型，分别是byte、short、int和long.
    * 二进制01111111 第一位是0，代表是正数
    * 二进制11111111 第一位是1，代表是负数
* 但是，这四种类型的整数都有一个共同的特点，就是它们的取值范围是有限的，而且在某些情况下，可能会丢失精度。
    * 例如，如果我们要计算两个很大的整数的乘积，那么我们可能会得到一个超出long类型的取值范围的结果。
    * 这时，我们就需要使用BigInteger类来处理这种情况。
* BigInteger类是一个不可变的类，它提供了一系列的方法来处理大整数的运算，例如加法、减法、乘法、除法等。
    * 构造方法：
        * 1.```public BigInteger(int num, Random rnd)```获取级大整数，范围是 $ [0, 2^{num}-1] $ 。
        * 2.```public BigInteger(String val)```获取大整数，范围是 $
          \left[ \begin{matrix} 0, 10^{val.length()}-1 \end{matrix} \right]  $ 。
        * 3.```public BigInteger(String val, int radix)```获取大整数，范围是 $ [0, radix^{val.length()}-1] $ 。
    * 常用方法：
        * 1.```public BigInteger add(BigInteger val)```加法。
        * 2.```public BigInteger subtract(BigInteger val)```减法。
        * 3.```public BigInteger multiply(BigInteger val)```乘法。
        * 4.```public BigInteger divide(BigInteger val)```除法。
        * 5.```public BigInteger remainder(BigInteger val)```取余。
        * 6.```public BigInteger pow(int exponent)```幂运算。
        * 7.```public BigInteger mod(BigInteger m)```取模。
        * 8.```public BigInteger gcd(BigInteger val)```最大公约数。
        * 9.```public BigInteger abs()```绝对值。
        * 10.```public int compareTo(BigInteger val)```比较大小。
        * 11.```public String toString()```转换为字符串。
        * 12.```public int intValue()```转换为int类型。
        * 13.```public long longValue()```转换为long类型。
        * 14.```public double doubleValue()```转换为double类型。
        * 15.```public float floatValue()```转换为float类型。
        * 16.```public byte byteValue()```转换为byte类型。
        * 17.```public short shortValue()```转换为short类型。
        * 18.```public static BigInteger valueOf(long val)```获取大整数。


* ```BigInteger```的底层存储方式：
    * 对于计算机而言，没有数据类型的概念
    * 数据类型都是编程语言自己设定的
    * ```BigInteger```底层存储的是一个数组，数组中的每个元素都是一个int类型的值
