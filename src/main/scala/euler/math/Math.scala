package euler.math

object Math {
  def even(n: BigInt) = n % 2 == 0

  def odd(n: BigInt) = n % 2 != 0

  lazy val fibonacci: Stream[BigInt] = 1 #:: 2 #:: fibonacci.zip(fibonacci.tail).map(x => x._1 + x._2)
}
