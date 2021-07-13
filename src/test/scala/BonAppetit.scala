import org.scalatest.funsuite.AnyFunSuite

class BonAppetit extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.bonAppetit(Array(3, 10, 2, 9), 1, 12) === 5)
  }

  test("Test 2") {
    assert(Solutions.bonAppetit(Array(1, 4, 4, 4, 5, 4), 3, 9) === "Bon Appetit")
  }

}
