import org.scalatest.funsuite.AnyFunSuite

class FormingMagicSquare extends AnyFunSuite with CommonMethods {
  /**
   * ```This problem from site HackerRank.com```
   *
   * Link: __https://www.hackerrank.com/challenges/sock-merchant/problem__
   */

  test("Test 1") {
    val test = "4 9 2\n3 5 7\n8 1 5".toMatrixInt
    assert(Solutions.formingMagicSquare(test) === 1)
  }
  test("Test 2") {
    val test = "4 8 2\n4 5 7\n6 1 6".toMatrixInt
    assert(Solutions.formingMagicSquare(test) === 4)
  }
  test("Test 3") {
    val test = "5 3 4\n1 5 8\n6 4 2".toMatrixInt
    assert(Solutions.formingMagicSquare(test) === 7)
  }
  test("Test 4") {
    val test = "3 5 4\n4 6 9\n4 5 3".toMatrixInt
    assert(Solutions.formingMagicSquare(test) === 16)
  }

}
