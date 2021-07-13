import org.scalatest.funsuite.AnyFunSuite

class SaveThePrisoner extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.saveThePrisoner(4, 6, 2) === 3)
  }

  test("Test 2") {
    assert(Solutions.saveThePrisoner(5, 2, 2) === 3)
  }

  test("Test 3") {
    assert(Solutions.saveThePrisoner(5, 2, 1) === 2)
  }


}
