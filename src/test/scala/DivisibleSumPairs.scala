import org.scalatest.funsuite.AnyFunSuite

class DivisibleSumPairs extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.divisibleSumPairs(6, 3, Array(1, 3, 2, 6, 1, 2)) === 5)
  }

}
