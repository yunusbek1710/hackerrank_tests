import scala.annotation.tailrec
import scala.collection.immutable

trait CommonMethods {

  implicit class StringImprovements(val s: String) {
    final def toMatrix(p1: String = "\n", p2: String = " "): Array[Array[String]] =
      s.split(p1).map(_.split(p2))

    final def toMatrix: Array[Array[String]] =
      s.split("\n").map(_.split(" "))

    final def toMatrixInt(p1: String = "\n", p2: String = " "): Array[Array[Int]] =
      s.toMatrix(p1, p2).map(_.map(_.toInt))

    final def toMatrixInt: Array[Array[Int]] =
      s.toMatrix.map(_.map(_.toInt))
  }

  implicit class ArrayOps[T](val array: Array[T]) {
    final def duplicates: immutable.Iterable[T] =
      array.groupBy(identity).collect { case (x, ys) if ys.lengthCompare(1) > 0 => x }
  }

  implicit class IntImprovements(val x: Int) {
    final def isEven: Boolean = x % 2 == 0

    final def isOdd: Boolean = x % 2 != 0
  }

  def search(list: Array[Int], key: Int): Int = {
    @tailrec
    def bsf(list: Array[Int], key: Int, start: Int, end: Int): Int = {
      if (start > end) return end + 1
      val mid = (start + end + 1) / 2
      list match {
        case arr if arr(mid) == key => mid
        case arr if arr(mid) > key && arr(mid + 1) <= key => mid + 1
        case arr if arr(mid) < key && arr(mid - 1) > key => mid
        case arr if arr(mid) > key => bsf(list, key, mid + 1, end)
        case arr if arr(mid) < key => bsf(list, key, start, mid - 1)
      }
    }

    bsf(list, key, 0, list.length - 1)
  }

  def generateMap(list: List[Int], map:Map[Int, Int]) : Map[Int, Int] = list match {
      case x :: y => if(map.keySet.contains(x)) generateMap(y, map ++ Map(x -> (map(x)+1)))
        else generateMap(y, map ++ Map(x -> 1))
      case Nil => map
  }

  def binarySearch(list: Array[Int], key: Int): Int = {
    @tailrec
    def bsf(list: Array[Int], key: Int, start: Int, end: Int): Int = {
      if (start > end) return -1
      val mid = (start + end) / 2
      list match {
        case arr if arr(mid) == key => mid
        case arr if arr(mid) > key => bsf(list, key, start, mid - 1)
        case arr if arr(mid) < key => bsf(list, key, mid + 1, end)
      }
    }

    bsf(list, key, 0, list.length - 1)
  }
}
