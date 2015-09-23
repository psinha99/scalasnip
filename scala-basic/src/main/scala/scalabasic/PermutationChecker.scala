package scalabasic

/**
 * @author purnendu
 */
object PermutationChecker extends App {

  assert(isPermutation("abc", "abd") == false)
  assert(isPermutation("abc", "cba") == true)
  assert(isPermutation("abc", "abc") == true)
  assert(isPermutation("abc", "xyz") == false)
  assert(isPermutation("abcd", "bacdd") == false)

  // if the given strings are permutation of each other


  
  def isPermutation(s1 : String, s2 : String) : Boolean = {
    val min = Math.min(Math.min('a'.toInt, 'z'.toInt), Math.min('A'.toInt, 'Z'.toInt))
    val max = Math.max(Math.max('a'.toInt, 'z'.toInt), Math.max('A'.toInt, 'Z'.toInt))
    def toNum(c : Char) = c.toInt - min    
    
    val tab = new Array[Int](max-min+1)
    for(c <- s1) tab(toNum(c)) += 1
    for(c <- s2) tab(toNum(c)) -= 1
    for(c <- s1) {
      if (tab(toNum(c)) != 0) {
       println(s" C <$c> " + tab(toNum(c)))
       return false
      }
    }
    true
  }
    
  
 
}