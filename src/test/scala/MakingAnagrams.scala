import org.scalatest.funsuite.AnyFunSuite

class MakingAnagrams extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/extra-long-factorials/problem?h_r=next-challenge&h_v=zen__
   */

  test("Test 1") {
    assert(Solutions.makingAnagrams("cde", "abc") === 4)
  }


}
