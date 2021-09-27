//lets use some sme Syntatic sugar!
package com.sampleCode
package mainCode
//previous lines set a nameSpace: the virtual space that
// u can Creat just by some commands!But it can limit your access!
// Access Modifiers can help!3types of modifier in scala:
//+no modifier(means public): we dont have public keyword in scala!But It means that member is visible to anyClass!
//+protected:The members of class are visible to that class and classes extend this class!
// There are someExamples in myPackage!
//+private:It means that part is visible only by that class and its objects!
//NOte the term of protected in Scala differs the java Term! if you want to introduse that
// consept in scala(visible in that package)
//you can use private[packageName] it means that member is visible juust to that package!

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
  //  compiler gets wrong from the next line,Java syntaxes is more different to Scala az we thaught
  //  let++
  //but nex line is ok!
  let += 1
  let = let + 1


def msg = "I was compiled by Scala 3. :)"
