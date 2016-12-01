package euler.problem

import euler.math.EulerMath

object Problem04 {
  def solve = (100 to 999).combinations(2).map(_.toList.product).map(x => BigInt(x)).filter(EulerMath.isPalindromicNumber).max
}
