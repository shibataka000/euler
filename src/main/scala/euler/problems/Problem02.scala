package euler.problems

import euler.math.EulerMath

object Problem02 {
  def solve = EulerMath.fibonacci.takeWhile(x => x < 4000000).filter(EulerMath.even).sum
}
