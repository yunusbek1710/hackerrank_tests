import org.scalatest.funsuite.AnyFunSuite

class AngryProfessor extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    assert(Solutions.angryProfessor(3,Array(-1,-3,4,2)) === "YES")
  }

  test("Test 2") {
    assert(Solutions.angryProfessor(2,Array(0,-1,2,1)) === "NO")
  }

}
