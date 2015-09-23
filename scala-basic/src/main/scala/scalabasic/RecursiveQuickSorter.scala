package scalabasic


/**
 * @author purnendu
 */
object RecursiveQuickSorter extends App {

  assert (sort(Array(2,3,1, 5, 4)).deep == Array(1, 2, 3, 4, 5).deep)
  assert (sort(Array(2,3,1, 1, 2, 5, 4)).deep == Array(1, 1, 2, 2, 3, 4, 5).deep)  
  assert (sort(Array(100)).deep == Array(100).deep)
  
  def sort(toBeSorted: Array[Int]): Array[Int] = {
    if (toBeSorted.length <= 1) toBeSorted
    else {
      val pivot = toBeSorted(toBeSorted.length / 2)
      Array.concat(
        sort(toBeSorted filter (pivot > _)),
        toBeSorted filter (pivot == _),
        sort(toBeSorted filter (pivot < _)))
    }
  }
}