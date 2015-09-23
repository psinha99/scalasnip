package scalabasic

/**
 * @author purnendu
 */
object IndexFinder extends App {

  assert(findFirst("abcd", "ac") == -1)
  assert(findFirst("abcd", "bc") == 1)
  assert(findFirst("abcd", "ab") == 0)
  assert(findFirst("abcd", "cd") == 2)
  assert(findFirst("abcd", "xyz") == -1)
  assert(findFirst("abcd", "c") == 2)
  assert(findFirst("abcd", "d") == 3)
  assert(findFirst("abcd", "a") == 0)
  assert(findFirst("abcd", "abcde") == -1)
  assert(findFirst("abcccde", "cde") == 4)  


  def findFirst(container: String, containee: String): Int = {
      def matchFrom(crI: Int, ceI: Int): Int = {
        containee.length - ceI match {
          case 0                               => crI - containee.length
          case x if x > container.length - crI => -1
          case _                               => if (container(crI) == containee(ceI)) matchFrom(crI + 1, ceI + 1) else matchFrom(crI - ceI + 1, 0)
        }
      }
    matchFrom(0, 0)
  }
}