package scalabasic

/**
 * @author purnendu
 */
object Palindrome extends App {
  assert(isPalindrome("ab a") == true)
  assert(isPalindrome("ab?c=") == false)
  assert(isPalindrome("") == true)
  assert(isPalindrome("abba") == true)
  assert(isPalindrome("abcba") == true)
  assert(isPalindrome("abbc") == false)
  
  assert(isPalindrome("nolemonnomelon") == true)  
  
  def isPalindrome(s : String) = {
    def check(b : Int = 0, e: Int = s.length()-1) : Boolean = {
      if (b >= e) true
      else if (!s(b).isLetter) check(b+1, e)
      else if (!s(e).isLetter) check(b, e-1)
      else if (s(b) == s(e)) check(b+1, e-1) 
      else false
    }

    check()
  }
  
}