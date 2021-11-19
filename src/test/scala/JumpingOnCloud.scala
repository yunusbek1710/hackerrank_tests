import org.scalatest.funsuite.AnyFunSuite

class JumpingOnCloud extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup__
   */

  test("Test 1") {
    assert(Solutions.jumpingOnCloud(Array(0, 0, 1, 0, 0, 1, 1, 0), 2) === 92)
  }

  test("Test 2") {
    assert(Solutions.jumpingOnCloud(Array(0, 0, 1, 0), 2) === 96)
  }

}
