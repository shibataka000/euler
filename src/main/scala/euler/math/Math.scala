package euler.math

object Math {
  def even(n: BigInt) = n % 2 == 0

  def odd(n: BigInt) = n % 2 != 0

  lazy val fibonacci: Stream[BigInt] = 1 #:: 2 #:: fibonacci.zip(fibonacci.tail).map(x => x._1 + x._2)

  def from(start: BigInt, step: BigInt = 1): Stream[BigInt] = start #:: from(start + step, step)

  def primes(): Stream[BigInt] = {
    def helper(l: Stream[BigInt]): Stream[BigInt] = l.head #:: helper(l.filter(_ % l.head != 0))
    2 #:: helper(from(3, 2))
  }
}
