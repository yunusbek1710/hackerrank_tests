import org.scalatest.funsuite.AnyFunSuite

class CatsAndMouse extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
  assert(Solutions.catAndMouse(1, 2, 3) === "Cat B")
  }

  test("Test 2") {
  assert(Solutions.catAndMouse(1, 3, 2) === "Mouse C")
  }

}
