

package scalabasic/**

import scala.annotation.elidable
import scala.annotation.elidable.ASSERTION
 * @author purnendu
 */
object Compressor extends App {

  assert((compressCharacter("aa") == "aa") == true)
  assert((compressCharacter("a") == "a") == true)
  assert((compressCharacter("aaabbbcc") == "a3b3cc") == true)
  
  def compressCharacter(s: String): String = {

      def compress(c: Char = s(0), pos: Int = 1, count: Int = 1, buf: String = ""): String = {
          def append(c: Char, count: Int, buf: String) = {
            count match {
              case 1 => buf + c
              case 2 => buf + c +c
              case _ => buf + c + count
            }
          }
        if (pos == s.length()) {
          append(c, count, buf)

        } else {
          if (s(pos) != c) {
            val v = append(c, count, buf)
            compress(s(pos), pos + 1, 1, v)
          } else {
            compress(c, pos + 1, count + 1, buf)
          }
        }
      }

    compress()
  }

}