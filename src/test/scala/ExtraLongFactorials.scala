import org.scalatest.funsuite.AnyFunSuite

class ExtraLongFactorials extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/extra-long-factorials/problem?h_r=next-challenge&h_v=zen__
   */

  test("Test 1") {
    assert(Solutions.extraLongFactorials(3) === 6)
  }

  test("Test 2") {
    assert(Solutions.extraLongFactorials(5) === 120)
  }

  test("Test 3") {
    assert(Solutions.extraLongFactorials(25) === BigInt.apply("15511210043330985984000000"))
  }

}
