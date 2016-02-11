package euler.problem

import org.specs2.mutable.Specification

class Problem02Spec extends Specification {
  "Problem02" should {
    "return answer 4613732" in {
      Problem02.solve must beEqualTo(4613732)
    }
  }
}
