
object Solutions extends CommonMethods {

  def sockMerchant(ar: Array[Int]): Int =
    ar.groupBy(identity).map(_._2.length / 2).sum

  def pageCount(n:Int, p: Int): Int = {
    val left = p/2
    val right = n/2 - p/2
    math.min(left, right)
  }
}
