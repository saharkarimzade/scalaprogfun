//lets use some Syntatic sugar!
package com.sampleCode
package mainCode

import scala.util.{Failure, Success}
import scala.util.Try
//previous lines set a nameSpace: the virtual space that
// u can Creat just by some commands!But it can limit your access!
// Access Modifiers can help!3types of modifier in scala:
//+no modifier(means public): we dont have public keyword in scala!But It means that member is visible to anyClass!
//+protected:The members of class are visible to that class and classes extend this class!
// There are someExamples in myPackage!
//+private:It means that part is visible only by that class and its objects!
//Note the term of "protected" in Scala differs the java Term! if you want to introduse that
// consept in scala(visible in that package)
//you can use private[packageName] =>it means that member is visible juust to that package!
// this consept is more usable than JAVA consept of Protected!

@main def hello: Unit =
  //  We are not forced to set curly brucets, indentation can set the blocks!
  println("Hello world!")
  println(msg)
  var b = new SampleClass(name = "Alexa", familyName = "Amazon", age = 11, height = 123.2)
  b.display()
  val n = SampleClass.numberOfChids
  println(n)
  SampleClass.printsth()
  SampleClass.objectOfClass.display()
  var let = 1
  //  compiler gets wrong from the next line,Java syntaxes is more different to Scala as we thaught
  //  let++
  //but next line is ok!
  let += 1
  let = let + 1
  println("-" * 100)//It prints - for 100 times!:)
  //Some example of blocks!We can use blocks for every variablke and funck and methods... but what retuns is the last line!
//  we have return in scala too, but we dont need it!
  var variable={
    //"\n" example
    //it will print "Happy learning!"" in a new line
    println("Hello world\nHappy learning!")
    //"\t" example
    //it will print "Happy learning!"" after a tab space
    println("Hello world\tHappy learning!")
    4567
  }
  println("variable="+variable)
  variable=
    var num1 = 324.141414
    printf("Roll Number"+ num1)

    print("------Roll Number = " + num1)
    1234
  //As you see we use INTENDATION instead of curly brackets!:)
  println(s"---- variable=$variable");
   //semicolonm is optional, Wher u put some command in a same line you should use it
  println("---- variable");

def msg = "I was compiled by Scala 3. :)"
//As u see we are not forces to set () in front of method name,
// but if we use it, we should use it everywhere we call this method.
//The most famous types of exceptions: Try Catch, Finally, Throws Keyword & Custom Exception
case class DivideByZero() extends Exception{
  //Custom Exceptions
  def divide(dividend: Int, divisor: Int): Int = {
    if (divisor == 0) {
      throw new DivideByZero
    }

    dividend / divisor
  }


//try/catch/finally
  def divideByZero(a: Int): Any = {
    try {
      divide(a, 0)
    } catch {
      case e: DivideByZero => null
    }
  }


//Try/Success/Failure
  def divideWithTry(dividend: Int, divisor: Int): Try[Int] = Try(divide(dividend, divisor))
  assert(divideWithTry(10, 0) == Failure(new DivideByZero))
  val result = divideWithTry(10, 0) match {
    case Success(i) => i
    case Failure(DivideByZero()) => None
  }

//Option/Some/None
  def divideWithOption(dividend: Int, divisor: Int): Option[Int] = {
    if (divisor == 0) {
      None
    } else {
      Some(dividend / divisor)
    }
  }
//Either/Left/Right
  def divideWithEither(dividend: Int, divisor: Int): Either[String, Int] = {
    if (divisor == 0) {
      Left("Can't divide by zero")
    } else {
      Right(dividend / divisor)
    }
  }

}