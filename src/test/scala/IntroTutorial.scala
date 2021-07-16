import org.scalatest.funsuite.AnyFunSuite

class IntroTutorial extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.introTutorial(4,Array(1, 4, 5, 7, 9, 12)) === 1)
  }
}
