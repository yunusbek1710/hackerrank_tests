import org.scalatest.funsuite.AnyFunSuite

class InsertionSort1 extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.insertionSort1(5, Array(2, 4, 6, 8, 3)) === Array(2, 3, 4, 6, 8))
  }
}
