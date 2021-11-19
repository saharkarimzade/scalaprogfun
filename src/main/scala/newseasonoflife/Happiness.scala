package newseasonoflife

object Happiness {
  def main(args: Array[String]): Unit = {

    //scala has val,var,lazy val,type
    //val is similar to constant in java
    val constant = 10
    //    it is similar to this one:
    val cons2 = {
      println("...")
      1339
      //the last thing in record returned
    }
    //scala is not a scripting language we don't have any neccessity for complicated things like hoisting(script languages like java script, php, python, rubby, perl(linux language), bash, powershel(windows language) and ...
    // run line to line and dosn't need compile anywher or compile line to line(like python) then we need to declare at first  and in next line get value )
//sth about . and *
    println("_" * 50)
    //lazy val is mix of val and function it means this val  bind value just when it used
    lazy val cons3 = {
      println("...")
      1339
      //the last thing in record returned
    }
    val unit: Unit = ()
    println(unit)

    println("_" * 50)
    val a: Int = 123 - 456
    println(a)
    println("_" * 50)
    println(Long.MaxValue)
    //Last code prints 9223372036854775807
    val a1: Long = 9223372036854775807l
    println(a1)
    val a2: Long = 9223372036854775807L
    println(a2)
    val a3: Float = 9223372036854775807f
    println(a3)
    val a4: Double = -0.545454
    println(a4)
    //    use colon for characters and use semicolon for string
    println('s')
    println('\n')
    println('\u2500')
    println("hello" + " " + "world")
    println(
      """hello
        |world""".stripMargin)

    println(
      """#hello
        #world""".stripMargin('#'))
    println(
      """hel
        |lo""".stripTrailing())
    println(
      """hel
        |lo""".stripLineEnd)
    println(
      """hel
        |lo""".substring(2))
    println("_" * 50)
    println(
      """hel
        |lo""".stripPrefix)
    println("_" * 50)
    var danger: Null = null
    println(danger)
    val  sample: String = null
    println("_" * 50)
    val yes: Boolean = true
    //val bb : Int= null
    //because of type safety of scala last code get error from compiler
    //we can not set null in scala exsept string and null;null type is
    // obvious but string type reason because it is a class from java
    println(yes)
    println("_" * 50)
    val no: Boolean = false
    println(no)
    println("_" * 50)
    val byteexample: Byte = Byte.MinValue
    println(byteexample)
    println("_" * 50)
  }
}