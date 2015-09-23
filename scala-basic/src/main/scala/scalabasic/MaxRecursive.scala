package scalabasic

/**
 * @author purnendu
 */
object MaxRecursive extends App {
  
  assert(max(Array(10,20,30)) == 30)
  assert(max(Array(50,20,30)) == 50)
  
  
  def max(numbers : Array[Int]) : Int = {
    def find(beginIndex:Int = 1, currentMax:Int = numbers(0)) : Int = {
      if (beginIndex == numbers.length) currentMax
      else find(beginIndex+1, if (currentMax>=numbers(beginIndex)) currentMax else numbers(beginIndex))
    }
    find()
  }
  
}