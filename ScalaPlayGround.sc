println(f"${1+3}")
println(f"${2+3}")


//import scala.annotation.tailrec
//
///*It's a simple example of methods in scala*/
//def sum(x: Int, y: Int) = x + y
//sum(2, 4)
///*It is a simple example of functions in scala*/
//val myFunc = (r: Int) => (r + 1)
//myFunc(4)
//var x = 2;
//val k = 3.4
//println(x + k)
//
///**
// * reassignment to val is not true then if you code "k=8" compiler recognize false coding
// */
//// k=3
///**
// * but reassignment to the var is ok
// */
//x = 7
//
///**
// * An simple example of tail recursive
// * It happens when last operation of the method
// * is just that method!!In this Example when I use tailRecfactorial(x-1)*x instead of
// * tailRecfactorial(x-1) compiler doesnt approve it as  tail recursive!Be consider if
// *
// * @param x
// * @return
// */
//@tailrec
//def tailRec(x: Int): Int = {
//  if x == 0 then 1 else
//    tailRec(x - 1)
//}
//
//def NottailRecfactorial(x: Int): Int = {
//  if x == 0 then 1 else
//    NottailRecfactorial(x - 1) * x
//}
//
//NottailRecfactorial(3)
////class&methods
//
///**
// *
// */
//class HomeChoices {
//  //Class variables
//  var StairsNumber: Int = 16
//  var nameofOrigin: String = "Nalada"
//
//  // Class method
//  def Display(): Unit = {
//    println("welcome to my simple class")
//    println("Name of the Origin : " + nameofOrigin);
//    println("Total number of Stairs: " + StairsNumber);
//  }
//}
//
//object Demo {
//
//  // Main method
//  def main(args: Array[String]) = {
//
//    // Class object
//    var obj = new HomeChoices();
//    obj.Display();
//  }
//
//}
//
//println("-----------------------")
//
////creating instance by using new keyword
//class Person {
//  //  class variables
//  var name = ""
//  var weight = ""
//
//  //class methods
//  def printName(name: String) = {
//    println("name is" + name)
//  }
//
//  override def toString = {
//    s"$name with $weight"
//  }
//
//}
//
////where this lines run???
//object MyPerson {
//  var p2 = new Person
//  //can we call an object in it?!
//  MyPerson.p2
//  p2.printName("kldfkdlf")
//
//  def apply(name: String): Person = {
//    var p = new Person()
//    p.printName(name)
//    p.name = name
//    p
//  }
//}
//
//val customPerson: Person = MyPerson.apply("Ehsan")
//println(s"custom Person: $customPerson")
//
///**
// * new example...poooof
// *
// * @param name
// * @param breed
// * @param age
// * @param color
// */
//class Dog(name: String, breed: String, age: Int, color: String) {
//  println("My name is:" + name + " my breed is:" + breed);
//  println("I am: " + age + " and my color is :" + color);
//
//}
//
//object MyDogObj {
//
//  // Main method
//  def main(args: Array[String]) = {
//    // Class object
//    var obj = new Dog("tuffy", "papillon", 5, "blue");
//  }
//}
//
//
////higherOrtherFunction
////a simple example is this
//val higherOrtherExample = (x: Int, f: Int => Int) => f(x)
////As u see at list one f the variables is a function
//val exampleFunc = (x: Int) => x + 5
//var z = higherOrtherExample(3, exampleFunc)
//println(z)
//
//
//
//
////curring
////SomeSugarSyntaxes
////Evaluation&Operators
////Class hierarchies
////How classes are organized
////Polymorphism
////Objects Everywhere
////Functions as Objects
////Object-Oriented Sets
////Pattern Matching
//
//
////Lists
//val list = List(1, 2, 3)
////Let’s define a function that doubles each value
//// that is given to it.
//def doubleValue = (x: Int) => 2 * x
//val doubledList = list.map(x => doubleValue(x))
//
//
//
////Enums
////Subtyping and Generics
////Variance
////A closerLookAtLists
////Tuples and Generic Methods
////Higher-order list functions
////Reduction of Lists
////Reasoning about lists
////Othr Collections
////Combinatorial Search and For-Expressions
////Maps
////Anagrams
//
//
//
//
