package euler.problems

import org.specs2.mutable.Specification

class Problem03Spec extends Specification {
  "Problem03" should {
    "return answer 6857" in {
      Problem03.solve must beEqualTo(6857)
    }
  }
}
