import org.scalatest.funsuite.AnyFunSuite

class PageCount extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.pageCount(5, 3) === 1)
  }

  test("Test 2") {
    assert(Solutions.pageCount(6, 5) === 1)
  }

  test("Test 3") {
    assert(Solutions.pageCount(5, 4) === 0)
  }

  test("Test 4") {
    assert(Solutions.pageCount(10, 6) === 2)
  }

  test("Test 5") {
    assert(Solutions.pageCount(100, 5) === 2)
  }

  test("Test 6") {
    assert(Solutions.pageCount(8, 8) === 0)
  }

}
