package scalabasic

/**
 * @author purnendu
 */

object Fibonacci extends App {
  for(i <- 1 to 100) println(s"Fib <$i> " + better(i))
  
  
  def bad(i : Int): Int = {
    if (i == 1 || i ==2) return 1
    bad(i-1) + bad(i-2)    
  }
 
  def good(i : Int) : Int = {
    if (i == 1 || i ==2) return 1
    
    val tab = new Array[Int](i)
    tab(0) = 1
    tab(1) = 1
    
    def fib1(i : Int) : Int = {
      if (tab(i-1) != 0) return tab(i-1)
      val v = fib1(i-1) + fib1(i-2)
      tab(i-1) = v
      return v
    }
    fib1(i)
    
    
  }
  
  
  def better(i : Int) : Int = {

    def fib3(n : Int, prev1 : Int=1, prev2 : Int=1) : Int = {
      n match {
        case `i`=> prev1+prev2
        case _ => fib3(n+1, prev1+prev2, prev1)
      }
    }
    i match {
      case x if x < 3 => 1
      case _ => fib3(3)
    }
    

  }
    
  
}