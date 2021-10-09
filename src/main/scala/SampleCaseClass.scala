


case class SampleCaseClass(a:Int,b:Int) {

  object MainObject {
    def main(args: Array[String]) = {
      var c = SampleCaseClass(10, 10) // Creating object of case class=> IT does not use any keyword to instatiate object
      c=SampleCaseClass(10,78)

      val h = SampleCaseClass(10, 10) // Creating object of case class=> IT does not use any keyword to instatiate object
      println("a = " + c.a) // Accessing elements of case class
      println("b = " + c.b)
    }

  }
}