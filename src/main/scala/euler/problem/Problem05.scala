package euler.problem

import euler.math.{Math => MyMath}

object Problem05 {
  def solve = (BigInt(1) to BigInt(20)).fold(BigInt(1))((z, n) => MyMath.lcm(z, n))
}
