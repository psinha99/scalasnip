package scalabasic

/**
 * @author purnendu
 */
object RecursiveMergeSorter extends App {

  assert(sort(Array(2, 3, 1, 5, 4)).deep == Array(1, 2, 3, 4, 5).deep)
  assert(sort(Array(2, 3, 1, 1, 2, 5, 4)).deep == Array(1, 1, 2, 2, 3, 4, 5).deep)
  assert(sort(Array(100)).deep == Array(100).deep)

  def sort(toBeSorted: Array[Int]): Array[Int] = {

      def merge(first: Array[Int], second: Array[Int]): Array[Int] = {
        if (first.isEmpty) second
        else if (second.isEmpty) first
        else if (first(0) < second(0))
          Array(first(0)) ++ merge(first slice (1, first.length), second)
        else
          Array(second(0)) ++ merge(first, second slice (1, second.length))
      }

    if (toBeSorted.length <= 1) toBeSorted
    else {
      val pivot = toBeSorted.length / 2
      merge(sort(toBeSorted slice (0, pivot)), sort(toBeSorted slice (pivot, toBeSorted.length)))
    }
  }
}