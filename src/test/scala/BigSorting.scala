import org.scalatest.funsuite.AnyFunSuite

class BigSorting extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.bigSorting(Array("31415926535897932384626433832795", "1", "3", "10", "3", "5"))
      === Array("1", "3", "3", "5", "10", "31415926535897932384626433832795"))
  }
}
