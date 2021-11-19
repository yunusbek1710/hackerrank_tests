import scala.annotation.tailrec
import scala.math._

object Solutions extends CommonMethods {

  def sockMerchant(ar: Array[Int]): Int =
    ar.groupBy(identity).map(_._2.length / 2).sum

  def pageCount(n: Int, p: Int): Int = {
    val left = p / 2
    val right = n / 2 - p / 2
    math.min(left, right)
  }

  def countingValleys(steps: Int, path: String): Int = {
    var valleys = 0
    var seaLevel = 0
    path.foreach(s => {
      if (s == 'U') {
        seaLevel += 1
      } else {
        seaLevel -= 1
      }
      if (seaLevel == 0 && s == 'U') {
        valleys += 1
      }
    })
    valleys
  }

  def getMoneySpent(keyboards: Array[Int], drives: Array[Int], b: Int): Int = {
    val comb = for {
      k <- keyboards
      d <- drives
      if k + d <= b
    } yield k + d
    if (comb.isEmpty) -1 else comb.max
  }

  def catAndMouse(x: Int, y: Int, z: Int): String = {
    if (abs(x - z) > abs(y - z)) {
      "Cat B"
    } else if (abs(x - z) < abs(y - z)) {
      "Cat A"
    } else {
      "Mouse C"
    }
  }

  def formingMagicSquare(matrix: Array[Array[Int]]): Int = {
    val Variants: Array[Array[Array[Int]]] = Array(
      Array(Array(8, 1, 6), Array(3, 5, 7), Array(4, 9, 2)),
      Array(Array(6, 1, 8), Array(7, 5, 3), Array(2, 9, 4)),
      Array(Array(4, 9, 2), Array(3, 5, 7), Array(8, 1, 6)),
      Array(Array(2, 9, 4), Array(7, 5, 3), Array(6, 1, 8)),
      Array(Array(8, 3, 4), Array(1, 5, 9), Array(6, 7, 2)),
      Array(Array(4, 3, 8), Array(9, 5, 1), Array(2, 7, 6)),
      Array(Array(6, 7, 2), Array(1, 5, 9), Array(8, 3, 4)),
      Array(Array(2, 7, 6), Array(9, 5, 1), Array(4, 3, 8))
    )
    Variants.foldLeft(Vector.empty[Int]) { (acc, v) =>
      acc :+ (v zip matrix).foldLeft(0) { case (sum, (v_row, m_row)) =>
        sum + (v_row zip m_row).foldLeft(0) { case (sum_col, (v_col, m_col)) =>
          if (v_col != m_col) sum_col + (v_col - m_col).abs else sum_col
        }
      }
    }.min
  }

  //  def pickingNumbers(a: Array[Int]): Unit = {
  //    val f: Set[Int] = a.sortWith(_ < _).toSet
  //    for(i <- 1 to f.)
  //    println(f)
  //  }

  def jumpingOnClouds(c: Array[Int]): Int = {
    var i = 0
    var length = c.length
    var jumps = 0
    while (i < length - 1) {
      if (i < length - 2 && c(i + 2) == 0) i += 2
      else i += 1
      jumps += 1
    }
    jumps
  }

  def repeatedString(s: String, n: Long): Long = {
    val aCount = s.count(_ == 'a')
    val nn = n / s.length
    val mod = (n % s.length).toInt
    nn * aCount + (s.substring(0, mod)).count(_ == 'a')
  }

  def findDigits(n: Int): Int = {
    n.toString.count(a => a != '0' && n % a.toString.toInt == 0)
  }

  def extraLongFactorials(n: Int): BigInt = {
    if (n < 1) 1
    else n * extraLongFactorials(n - 1)
  }

  //  def appendAndDelete(s: String, t: String, k: Int): String = {
  //
  //  }

  //  def getTotalX(a: Array[Int], b: Array[Int]): Int = {
  //
  //  }

  def aVeryBigSum(ar: Array[Long]): Long = {
    var summ: Long = 0L
    for (i <- 1 until ar.length) {
      summ += ar(i)
    }
    summ
  }

  //  def longestSubarray(arr: Array[Int]): Int = {
  //    val list = for (i <- 0 until arr.length - 1) yield {
  //      s"${arr(i)}${arr(i + 1)}" -> (arr(i) - arr(i + 1))
  //    }
  //    println(list.groupBy(_._1).map{ case (str, value) => (str * value.length).length})
  //    list.groupBy(_._1).map{ case (str, value) => (str * value.length).length}.max
  //  }

  def makingAnagrams(s1: String, s2: String): Int = {
    (s1 + s2).length - 2 * (s1 intersect s2).length
  }

  def designerPdfViewer(h: Array[Int], word: String): Int = {
    var maxx = 0
    word.foreach(a => if (h(a.toInt - 97) >= maxx) maxx = h(a.toInt - 97))
    maxx * word.length
  }

  def angryProfessor(k: Int, a: Array[Int]): String = {
    var count = 0
    a.foreach(i => if (i <= 0) count += 1)
    println(count)
    if (count >= k) {
      "NO"
    } else {
      "YES"
    }
  }

  def viralAdvertising(n: Int): Int = {
    var people: Int = 5
    var sum: Int = 0
    for (i <- 0 until n) {
      people = Math.floor(people / 2).toInt
      sum += people
      people *= 3
    }
    sum
  }

  def saveThePrisoner(n: Int, m: Int, s: Int): Int = {
    if ((s - 1 + m) % n == 0) {
      n
    } else {
      (s - 1 + m) % n
    }
  }

  def simpleArraySum(ar: Array[Int]): Int = {
    ar.sum
  }

  def divisibleSumPairs(n: Int, k: Int, ar: Array[Int]): Int = {
    val l = for {
      i <- ar.indices
      j <- i + 1 until ar.length
      if (ar(i) + ar(j)) % k == 0
    } yield 1
    l.sum
  }

  def migratoryBirds(arr: Array[Int]): Int = {
    val a = arr.groupBy(identity).map { case (k, v) => k -> v.length }
    val max = a.values.max
    a.filter(_._2 == max).min._1
  }

  def timeConversion(s: String): String = {
    if (s.takeRight(2) == "PM") {
      if (s.take(2) == "12") {
        s.substring(0, 8)
      } else {
        (s.replaceFirst(s.take(2), (s.take(2).toInt + 12).toString)).substring(0, 8)
      }
    }
    else {
      if (s.take(2).toInt == 12) {
        (s.replaceFirst(s.take(2), "00")).substring(0, 8)
      } else {
        s.substring(0, 8)
      }
    }
  }

  def bonAppetit(bill: Array[Int], k: Int, b: Int): Any = {
    var summ = bill.sum - bill(k)
    if (summ / 2 == b) {
      "Bon Appetit"
    } else {
      b - (summ / 2)
    }
  }

  def utopianTree(n: Int): Int = {
    var summ = 0
    for (i <- 0 to n) {
      if (n == 0) {
        summ += 1
      } else if (i == 0) {
        summ += 1
      } else if (i % 2 == 0) {
        summ += 1
      } else {
        summ *= 2
      }
    }
    summ
  }

  def beautifulDays(i: Int, j: Int, k: Int): Int = {
    val res = for {
      a <- i to j
      if (a.toString.reverse == a.toString && (abs((a.toString.reverse).toInt - (a.toString).toInt) / k).isInstanceOf[Int])
    } yield 1
    res.sum
  }

  def cutTheSticks(arr: Array[Int]): Array[Int] = {
    @tailrec
    def go(a: Array[Int], res: Array[Int] = Array.empty): Array[Int] = {
      if (a.nonEmpty) {
        val array = a.map(_ - a.min)
        go(array.filter(_ > 0), res :+ array.length)
      } else res
    }

    go(arr)
  }

  def bigSorting(unsorted: Array[String]): Array[String] = {
    unsorted.sortWith((a, b) =>
      if (a.length != b.length) a.length < b.length
      else a < b)
  }

  def introTutorial(V: Int, arr: Array[Int]): Int = {
    arr.indexOf(V)
  }

  def insertionSort1(n: Int, arr: Array[Int]): Array[Int] = {
    var t = 0
    for {
      i <- arr.length - 1 to 0 by -1
      j <- i - 1 to 0 by -1
    } {
      if (arr(i) < arr(j)) {
        t = arr(i)
        arr(i) = arr(j)
        println(arr.mkString(" "))
        arr(j) = t
      }
    }
    println(arr.mkString(" "))
    arr
  }

  def insertionSort2(n: Int, arr: Array[Int]): Array[Int] = {
    for (i <- 1 until arr.length) {
      var j: Int = i
      val value: Int = arr(i)
      while (j >= 1 && arr(j - 1) > value) {
        arr(j) = arr(j - 1)
        j -= 1
      }
      arr(j) = value
      println(arr.mkString(" "))
    }
    arr
  }

  def quickSort(arr: Array[Int]): Array[Int] = {
    var arr1: Array[Int] = arr.filter(a => a < arr(0)) :+ arr(0)
    var arr2: Array[Int] = arr.filter(b => b > arr(0))
    arr1 ++ arr2
  }

  def closestNumbers(arr: Array[Int]): Array[Int] = {
    val sorted = arr.sorted
    val index = for {
      i <- 0 to sorted.length - 2
    } yield (sorted(i + 1) - sorted(i) -> Array(sorted(i),sorted(i + 1)))
    val min = index.minBy(_._1)
    val res = index.filter(_._1 == min._1)
    res.flatMap(_._2).toArray
  }

  def jumpingOnCloud(c: Array[Int], k: Int): Int = {
    val d = c.length / k
    var s = 100
    for(i <- k to d by k) {
      println(c(i))
      if(c(i) == 1) {
        s -= 3
        println(s)
      } else {
        s -= 1
        println(s)
      }
    }
    s - 1
  }



}
