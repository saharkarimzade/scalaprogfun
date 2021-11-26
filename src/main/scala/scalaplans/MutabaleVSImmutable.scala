package scalaplans

object MutabaleVSImmutable extends App{
  //first subject answer:Immutable means unchangable, Immutable In java described as this:
//some kind of variables like Long and Int and some other that you can change the value of it but then jvm makes a new object for them
//but in scala this words uses just for collection:
//you can cange a mutable collection and you cant change an immutable collection,every time you change an immutable collection
// another collection prodused instead of modifing original colection!
//it differs with val and val because you can not change val anytime and every time you change a var jvm doesnt creat new object!
//we can check it with reference
 val fruit:List[String]=List("apple","orange","pear")

  val newfruit: Object =fruit:+"klsklskdlks"
print(newfruit.asInstanceOf[Object])





}
