package euler.problems

import euler.math.EulerMath

object Problem05 {
  def solve = (BigInt(1) to BigInt(20)).fold(BigInt(1))((z, n) => EulerMath.lcm(z, n))
}
