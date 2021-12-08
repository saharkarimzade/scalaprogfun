package scalaplans

import scala.Console.println
import scala.collection.mutable.ListBuffer

object MutabaleVSImmutable extends App{
  //first subject answer:Immutable means unchangable, Immutable In java described as this:
//some kind of variables like Long and Int and some other that you can change the value of it but then jvm makes a new object for them
//but in scala this words uses just for collection:
//you can cange a mutable collection and you cant change an immutable collection,every time you change an immutable collection
// another collection prodused instead of modifing original colection!
//it differs with val and val because you can not change val anytime and every time you change a var jvm doesnt creat new object!
//we can check it with reference
 var fruit:List[String]=List("apple","orange","pear")

  var newfruit: Object =fruit:+"klsklskdlks"


//  if(fruit.equals(newfruit))
//    println("yes")
//  else println( "no")
print(newfruit.asInstanceOf[Object])
val original : List[String]=List( "1" , "2")

  original==( original.map(x => if(x.equals("3")) "2" else "1"))


  var progLang = ListBuffer("C", "C++", "Java", "Scala", "Python", "JavaScript")

  println("Programming Languages: " + progLang)

  println("Deleting single element")
  progLang -= "JavaScript"
  progLang+="JavaScript"



}
