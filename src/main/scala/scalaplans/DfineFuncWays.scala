package scalaplans

object DfineFuncWays extends App {
//( There are different types of functions in Scala: abstract, concrete, anonymous, high order, pure, impure etc...)
//how to define function with input and output(with `def`)
def addInt( a:Int, b:Int ) : Int = {
  var sum:Int = 0
  sum = a + b
  return sum
}
  def even: Int => Boolean = _ % 2 == 0
//  def means call-by-name
//  how to define function with input and output(with `val`) and see how you could define an anonymous function(Lambda)
val evenByVal: Int => Boolean = _ % 2 == 0
//val means call-by-value


//how you could define an anonymous function(Lambda)?
//An anonymous function—also referred to as a lambda—is a block of code that’s passed as an argument to a higher-order function.
  val ints = List(1, 2, 3)
  val doubledInts = ints.map(_ * 2)   // List(2, 4, 6)
  val doubledInts1 = ints.map((i: Int) => i * 2)
  val doubledInts2 = ints.map((i) => i * 2)
  val doubledInts3 = ints.map(i => i * 2)
  ints.foreach((i: Int) => println(i))
  ints.foreach(i => println(i))
  ints.foreach(println(_))
  ints.foreach(println)

  var userDir = () => { System.getProperty("user.dir") }
  println( userDir )


}



