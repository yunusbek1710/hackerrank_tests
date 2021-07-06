import org.scalatest.funsuite.AnyFunSuite

class FindDigit extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.findDigits(124) === 3)
  }

  test("Test 2") {
    assert(Solutions.findDigits(111) === 3)
  }

  test("Test 3") {
    assert(Solutions.findDigits(10) === 1)
  }

  test("Test 4") {
    assert(Solutions.findDigits(12) === 2)
  }

  test("Test 5") {
    assert(Solutions.pageCount(100, 5) === 2)
  }

  test("Test 6") {
    assert(Solutions.pageCount(8, 8) === 0)
  }

}
