import org.scalatest.funsuite.AnyFunSuite

class QuickSort extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.quickSort(Array(4, 5, 3, 7, 2)) === Array(3, 2, 4, 5, 7))
  }
}
