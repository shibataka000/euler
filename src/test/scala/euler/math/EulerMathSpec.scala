package euler.math

import euler.math.EulerMath

import org.specs2.mutable.Specification

class MathSpec extends Specification {
  "even" should {
    "return true when number is even" in {
      EulerMath.even(0) must beEqualTo(true)
      EulerMath.even(2) must beEqualTo(true)
      EulerMath.even(-2) must beEqualTo(true)
    }
    "return false when number is odd" in {
      EulerMath.even(1) must beEqualTo(false)
      EulerMath.even(-1) must beEqualTo(false)
    }
  }

  "odd" should {
    "return true when number is odd" in {
      EulerMath.odd(1) must beEqualTo(true)
      EulerMath.odd(-1) must beEqualTo(true)
    }
    "return false when number is even" in {
      EulerMath.odd(0) must beEqualTo(false)
      EulerMath.odd(2) must beEqualTo(false)
      EulerMath.odd(-2) must beEqualTo(false)
    }
  }

  "fibonacci" should {
    "return 1,2,3,5,8,13,21,34,55,89 as first 10 elements" in {
      EulerMath.fibonacci.take(10) must beEqualTo(List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89))
    }
  }

  "from" should {
    "return 0,1,2,3,4,5,6,7,8,9 as first 10 elements" in {
      EulerMath.from(0).take(10).toList must beEqualTo(List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9))
    }
    "return 0,2,4,6,8,10,12,14,16,18 as first 10 elements when step 2 is given" in {
      EulerMath.from(0, 2).take(10).toList must beEqualTo(List(0, 2, 4, 6, 8, 10, 12, 14, 16, 18))
    }
    "return 0,-1,-2,-3,-4,-5,-6,-7,-8,-9 as first 10 elements when step -1 is given" in {
      EulerMath.from(0, -1).take(10).toList must beEqualTo(List(0, -1, -2, -3, -4, -5, -6, -7, -8, -9))
    }
  }

  "primes" should {
    "return correct primes while < 100" in {
      EulerMath.primes.takeWhile(_<100) must beEqualTo(List(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97))
    }
  }

  "decompose" should {
    "return List(1) as decomposed numbers of 1" in {
      EulerMath.decompose(1) must beEqualTo(List(1))
    }
    "return List(2) as decomposed numbers of 2" in {
      EulerMath.decompose(2) must beEqualTo(List(2))
    }
    "return List(2,2) as decomposed numbers of 4" in {
      EulerMath.decompose(4) must beEqualTo(List(2, 2))
    }
    "return List(5,7,13,29) as decomposed numbers of 13195" in {
      EulerMath.decompose(13195) must beEqualTo(List(5, 7, 13, 29))
    }
  }

  "gcd" should {
    "return 6 as gcd(18, 12)" in {
      EulerMath.gcd(12, 18) must beEqualTo(6)
    }
    "return 9 as gcd(27, 18)" in {
      EulerMath.gcd(27, 18) must beEqualTo(9)
    }
    "return 1 as gcd(2, 3)" in {
      EulerMath.gcd(2, 3) must beEqualTo(1)
    }
  }

  "lcm" should {
    "return 36 as lcm(18, 12)" in {
      EulerMath.lcm(12, 18) must beEqualTo(36)
    }
    "return 54 as lcm(27, 12)" in {
      EulerMath.lcm(27, 18) must beEqualTo(54)
    }
  }
}
