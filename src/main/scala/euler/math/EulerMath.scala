package euler.math

object EulerMath {
  def even(n: BigInt) = n % 2 == 0

  def odd(n: BigInt) = n % 2 != 0

  lazy val fibonacci: Stream[BigInt] = 1 #:: 2 #:: fibonacci.zip(fibonacci.tail).map(x => x._1 + x._2)

  def from(start: BigInt, step: BigInt = 1): Stream[BigInt] = start #:: from(start + step, step)

  def primes(): Stream[BigInt] = {
    def helper(l: Stream[BigInt]): Stream[BigInt] = l.head #:: helper(l.filter(_ % l.head != 0))
    2 #:: helper(from(3, 2))
  }

  def decompose(n: BigInt): List[BigInt] = {
    def helper(a: BigInt, ps: Stream[BigInt]): List[BigInt] = 
      if (a == 1) Nil
      else if (a % ps.head == 0) ps.head :: helper(a / ps.head, ps)
      else helper(a, ps.tail)
    if (n == 1) List(1)
    else helper(n, primes)
  }

  def isPalindromicNumber(n: BigInt): Boolean = n.toString == n.toString.reverse

  def gcd(a: BigInt, b: BigInt): BigInt =
    if (b > a) gcd(b, a)
    else if (b == 0) a
    else gcd(b, a % b)

  def lcm(a: BigInt, b: BigInt): BigInt = a * b / gcd(a, b)
}
