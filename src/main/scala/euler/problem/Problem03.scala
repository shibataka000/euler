package euler.problem

import euler.math.{Math => MyMath}

object Problem03 {
  def solve = MyMath.decompose(BigInt("600851475143")).max
}
