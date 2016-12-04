package euler.problems

import euler.math.EulerMath

object Problem04 {
  def solve = (BigInt(100) to BigInt(999)).combinations(2).map(_.toList.product).filter(EulerMath.isPalindromicNumber).max
}
