import org.scalatest.funsuite.AnyFunSuite

class ViralAdvertising extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.viralAdvertising(3) === 9)
  }

  test("Test 2") {
    assert(Solutions.viralAdvertising(4) === 15)
  }


}
