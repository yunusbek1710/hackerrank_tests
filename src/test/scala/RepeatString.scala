import org.scalatest.funsuite.AnyFunSuite

class RepeatString extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup__
   */

  test("Test 1") {
    assert(Solutions.repeatedString("aba", 10) === 7)
  }

  test("Test 2") {
    assert(Solutions.repeatedString("a", 1000000000000L) === 1000000000000L)
  }

}
