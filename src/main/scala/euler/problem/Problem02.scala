package euler.problem

import euler.math.{Math => MyMath}

object Problem02 {
  def solve = MyMath.fibonacci.takeWhile(x => x < 4000000).filter(MyMath.even).sum
}
