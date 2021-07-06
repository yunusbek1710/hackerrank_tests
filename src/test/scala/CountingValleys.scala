import org.scalatest.funsuite.AnyFunSuite

class CountingValleys extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.countingValleys(8, "UDDDUDUU") === 1)
  }

}
