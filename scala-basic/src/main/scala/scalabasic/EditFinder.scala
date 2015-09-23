package scalabasic

/**
 * @author purnendu
 */
object EditFinder extends App {
  assert(lessThan2Edits("pale", "ple") == true)
  assert(lessThan2Edits("pales", "pale") == true)
  assert(lessThan2Edits("pale", "bale") == true)
  assert(lessThan2Edits("pale", "bake") == false)
  assert(lessThan2Edits("pale", "pales") == true)
  assert(lessThan2Edits("pale", "paless") == false)
  assert(lessThan2Edits("p", "") == true)
  assert(lessThan2Edits("", "s") == true)
  
  
  

  def lessThan2Edits(s1: String, s2: String) = {
    val diff = s1.length() - s2.length()

      def matchFrom(fi: Int = 0, si: Int = 0, editCount: Int = 0): Boolean = {
        if (fi == s1.length() || si == s2.length()) true
        else {
          if (s1(fi) != s2(si)) {
            if (editCount > 0) false
            else
              diff match {
                case x if x == 0 => matchFrom(fi + 1, si + 1, editCount + 1)
                case x if x < 0  => matchFrom(fi, si + 1, editCount + 1)
                case _           => matchFrom(fi + 1, si, editCount + 1)
              }

          } else {
            matchFrom(fi + 1, si + 1, editCount)
          }
        }
      }

    if (Math.abs(diff) > 1) false else matchFrom()
  }

}