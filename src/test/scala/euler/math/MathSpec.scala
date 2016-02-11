package euler.math

import euler.math.{Math => MyMath}

import org.specs2.mutable.Specification

class MathSpec extends Specification {
  "even" should {
    "return true when number is even" in {
      MyMath.even(0) must beEqualTo(true)
      MyMath.even(2) must beEqualTo(true)
      MyMath.even(-2) must beEqualTo(true)
    }
    "return false when number is odd" in {
      MyMath.even(1) must beEqualTo(false)
      MyMath.even(-1) must beEqualTo(false)
    }
  }

  "odd" should {
    "return true when number is odd" in {
      MyMath.odd(1) must beEqualTo(true)
      MyMath.odd(-1) must beEqualTo(true)
    }
    "return false when number is even" in {
      MyMath.odd(0) must beEqualTo(false)
      MyMath.odd(2) must beEqualTo(false)
      MyMath.odd(-2) must beEqualTo(false)
    }
  }

  "fibonacci" should {
    "return 1,2,3,5,8,13,21,34,55,89 as first 10 elements" in {
      MyMath.fibonacci.take(10) must beEqualTo(List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89))
    }
  }
}
