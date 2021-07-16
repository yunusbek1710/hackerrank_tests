import org.scalatest.funsuite.AnyFunSuite

class CutTheSticks extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.cutTheSticks(Array(5, 4, 4, 2, 2, 8)) === Array(6, 4, 2, 1))
  }
}
