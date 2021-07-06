import org.scalatest.funsuite.AnyFunSuite

class AVeryBigSum extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.aVeryBigSum(Array(1000000001L,1000000002L,1000000003L,1000000004L,1000000005L)) === 5000000015L)
  }

}
