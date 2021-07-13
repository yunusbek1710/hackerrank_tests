import org.scalatest.funsuite.AnyFunSuite

class UtopianTree extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.utopianTree(5) === 14)
  }

  test("Test 2") {
    assert(Solutions.utopianTree(0) === 1)
  }

  test("Test 3") {
    assert(Solutions.utopianTree(1) === 2)
  }

  test("Test 4") {
    assert(Solutions.utopianTree(4) === 7)
  }

}
