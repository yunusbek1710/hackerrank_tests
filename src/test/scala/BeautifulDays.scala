import org.scalatest.funsuite.AnyFunSuite

class BeautifulDays extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.beautifulDays(20, 23, 6) === 2)
  }

}
