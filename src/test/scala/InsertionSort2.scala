import org.scalatest.funsuite.AnyFunSuite

class InsertionSort2 extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.insertionSort2(7, Array(3, 4, 7, 5, 6, 2, 1)) === Array(1, 2, 3, 4, 5, 6, 7))
  }
}
