import org.scalatest.funsuite.AnyFunSuite

class MigratoryBirds extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.migratoryBirds(Array(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)) === 3)
  }

  test("Test 2") {
    assert(Solutions.migratoryBirds(Array(1, 4, 4, 4, 5, 3)) === 4)
  }

}
