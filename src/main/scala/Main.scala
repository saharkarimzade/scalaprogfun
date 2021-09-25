@main def hello: Unit =
  println("Hello world!")
  println(msg)
  var b = new SampleClass(name = "Alexa", familyName = "Amazon", age = 11, height = 123.2)
  b.display()
  val n = SampleClass.numberOfChids
  println(n)
  SampleClass.printsth()
  SampleClass.objectOfClass.display()
def msg = "I was compiled by Scala 3. :)"
