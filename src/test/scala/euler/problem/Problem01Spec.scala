package euler.problem

import org.specs2.mutable.Specification

class Problem01Spec extends Specification {
  "Problem01" should {
    "return answer 233168" in {
      Problem01.solve must beEqualTo(233168)
    }
  }
}
