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

  "from" should {
    "return 0,1,2,3,4,5,6,7,8,9 as first 10 elements" in {
      MyMath.from(0).take(10).toList must beEqualTo(List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9))
    }
    "return 0,2,4,6,8,10,12,14,16,18 as first 10 elements when step 2 is given" in {
      MyMath.from(0, 2).take(10).toList must beEqualTo(List(0, 2, 4, 6, 8, 10, 12, 14, 16, 18))
    }
    "return 0,-1,-2,-3,-4,-5,-6,-7,-8,-9 as first 10 elements when step -1 is given" in {
      MyMath.from(0, -1).take(10).toList must beEqualTo(List(0, -1, -2, -3, -4, -5, -6, -7, -8, -9))
    }
  }

  "primes" should {
    "return correct primes while < 100" in {
      MyMath.primes.takeWhile(_<100) must beEqualTo(List(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97))
    }
  }

  "decompose" should {
    "return List(1) as decomposed numbers of 1" in {
      MyMath.decompose(1) must beEqualTo(List(1))
    }
    "return List(2) as decomposed numbers of 2" in {
      MyMath.decompose(2) must beEqualTo(List(2))
    }
    "return List(2,2) as decomposed numbers of 4" in {
      MyMath.decompose(4) must beEqualTo(List(2, 2))
    }
    "return List(5,7,13,29) as decomposed numbers of 13195" in {
      MyMath.decompose(13195) must beEqualTo(List(5, 7, 13, 29))
    }
  }
}
