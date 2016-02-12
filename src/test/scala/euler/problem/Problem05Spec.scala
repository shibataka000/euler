package euler.problem

import org.specs2.mutable.Specification

class Problem05Spec extends Specification {
  "Problem05" should {
    "return answer 232792560" in {
      Problem05.solve must beEqualTo(232792560)
    }
  }
}
