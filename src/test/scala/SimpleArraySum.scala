import org.scalatest.funsuite.AnyFunSuite

class SimpleArraySum extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.simpleArraySum(Array(1,2,3,4)) === 10)
  }

}
