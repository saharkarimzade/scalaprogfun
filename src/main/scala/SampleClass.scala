//lets use some sme Syntatic sugar!
package com.sampleCode
package mainCode
//previous lines


class SampleClass(name: String, familyName: String, age: Int, height: Double)  {
  //the class variable are val(I can say mutable in replace) by default uless you mention,
  // aproximately we can say everything in scala is or should
  // be immutabe unless there is a strong reason for it! It cause you see less bugs in RUNTIME!
  //and every bugs show in compiletime!
  //varaibles are private
  //we cant assingn to class variables because they are val! just one time assignment! then they have getter but not setter!
  //ofcourse its getters are hidden in itself!then you never need to define them like java!
  //how we can set variables of class??? in general just by newing the class!because the are val:ex new Sampleclass(nam="ddkuf",familyName="klklklk",...)

  /**
   * you can call the methods of class in anothar place by getting new of it!
   *
   * @param sample
   */
  
  def display(): Unit = {
    println(s"$name $age $familyName")
    //In previous line we used STRING INTERPOLATOR(s-f-$)
    //something like that:
    println(f"$age")
    println(s"$${1+1}") //prints ${1+1}
    println(s"${1 + 1}") //prints {2}
    println(f" $height")
    //this two lines are the same:
    println(f" ${this.height}%2.2f ")
    println(f" $height%2.2f ")
    //    why we use f? because of some formatting of java! like %d... but yet I can not run it!:/
    //I should try this question: Is the result of sample.height and height different?

  }

}

/**
 * companionObject=>ALT+Enter on the name of class and select AddCompanionObject
 * The name of cmpanion object is same as its class(can we have an object whit different name?yes! but it is not companion!I dont know usage of it yet) you can call its method whenever you want(sth like static methods in java)-when you creat companion object the colour of the circle of class of intellij gets 2 colour(blue-brown) from one colour(blue)!
 * in scala there is not any keyword static like java! we should use its usage just by createing CompanionObject! every method and value of it  is usable without getting new
 */
object SampleClass {
  //  this line gets bug because we are not  get initial value to that variable  anf after that we never could get it value!
  //  val numberOfChids:Int
  //If we define a value
  val numberOfChids: Int = 0
  //Static Cunstructor:(be awarw it is from THE Class NOT COMPANION OBJECT)
  def objectSampleStatuivConstructor(age: Int) = new SampleClass("sahar","karimzadeh", age, 169)
  val f: Int => Int = (x: Int) => (x + 1)
  val objectOfClass = new SampleClass("sahar","karimzadeh", 12, 169)

  def printsth() = {
    println("hi I am a func os comparison object")
  }

  def printOneOfVariables()=println(numberOfChids)


}
