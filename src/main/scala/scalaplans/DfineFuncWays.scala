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

}



