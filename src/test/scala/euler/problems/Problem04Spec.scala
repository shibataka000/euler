package euler.problems

import org.specs2.mutable.Specification

class Problem04Spec extends Specification {
  "Problem04" should {
    "return answer 906609" in {
      Problem04.solve must beEqualTo(906609)
    }
  }
}
