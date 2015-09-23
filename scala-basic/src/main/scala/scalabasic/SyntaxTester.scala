package scalabasic

/**
 * @author purnendu
 */
object SyntaxTester {

  def main(args: Array[String]) {
    assert(fact(1) == 1)
    assert(fact(2) == 2)
    assert(fact(3) == 6)

    println(fact(4))
  
  
  var b = collection.mutable.ArrayBuffer(1,3,4)
  b.insert(2,7,8,9)
  println(b)
  
  
  val userinfo = ("Mike", 25)
  val (name, age) = userinfo
  
  println (name)
 
    println(userinfo)
    
    
    val a = Array.ofDim[Int](1, 2)
    
    val x = 0
    val y = 1
    
 
   type t = Int => Int
  def echo(args:String*) = args.foreach { println}
  echo("I", "am") 
  
  def xyz(i:Int) = 10
  
   
  }

  def fact(n: Int): Int = {
      def fact1(current: Int = 1, prod: Int = 1): Int = {
        if (current == n) prod
        else fact1(current + 1, (current + 1) * prod)
      }
    fact1()
  }

  
  
  
}




