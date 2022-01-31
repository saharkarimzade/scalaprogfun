


case class SampleCaseClass(a:Int,b:Int) {
//*******************all constructor parameters are public and immutable by default********
// *We can change them to be var, but it’s not what they were designed for.*
// **.In classes constructor parameters are private by default****(Also, Java 14 introduced similar concept called records!!!)

  object MainObject {
    def main(args: Array[String]) = {
      var c = SampleCaseClass(10, 10) // Creat object of case class In short way!!=> IT does not use any keyword to instatiate object
      //we could use new...
      c=SampleCaseClass(10,78)

      val h = SampleCaseClass(10, 10) // Creating object of case class=> IT does not use any keyword to instatiate object
      println("a = " + c.a) // Accessing elements of case class
      println("b = " + c.b)
      //we can see how pattern matching works in case classes
      h match {
        case SampleCaseClass(10,4) => s"The h.a is $h.a"
      }
    }

  }
  object tupleExample{
    def main(args:Array[String])={
      //tuple is a collection of elements
      //tuples can store different types of variables and they are immutable unlike array
      var name=(12,5,"dsdsdsd")
      //we use tupleName._n access to that element that stats from 1
      println(s"$name._1")
      //pattern matching in tuples:
      var (a, b, c) = (15, "chandan", true)
      println(a)
      println(b)
      println(c)
      //Iterating over a tuple:
      name.productIterator.foreach{i=>println(i)}
      //converting tuple to string
      println(name.toString() )
    }
  }
}