import org.scalatest.funsuite.AnyFunSuite

class TimeConversion extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.timeConversion("12:01:00PM") === "12:01:00")
  }

  test("Test 2") {
    assert(Solutions.timeConversion("12:01:00AM") === "00:01:00")
  }

}
