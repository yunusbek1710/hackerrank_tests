import org.scalatest.funsuite.AnyFunSuite

class GetMoneySpent extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.getMoneySpent(Array(40,50,60),Array(5,8,12),60) === 58)
  }

  test("Test 2") {
    assert(Solutions.getMoneySpent(Array(4),Array(5),5) === -1)
  }

}
