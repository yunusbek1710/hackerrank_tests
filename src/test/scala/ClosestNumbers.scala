import org.scalatest.funsuite.AnyFunSuite

class ClosestNumbers extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.closestNumbers(Array(5, 4, 3, 2)) === Array(2, 3, 3, 4, 4, 5))
  }
}
