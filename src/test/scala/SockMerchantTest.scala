import org.scalatest.funsuite.AnyFunSuite

class SockMerchantTest extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.sockMerchant(Array(10, 20, 20, 10, 10, 30, 50, 10, 20)) === 3)
  }

  test("Test 2") {
    assert(Solutions.sockMerchant(Array(1, 2, 1, 2, 1, 3, 2)) === 2)
  }

}
