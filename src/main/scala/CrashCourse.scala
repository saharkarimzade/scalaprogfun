import scala.annotation.tailrec
import scala.collection.immutable


object CrashCourse extends App :

  /* some scala practice based on   www.youtube.com/watch?v=-xRfJcwhy7A&list=PLJGDHERh23x9Y1Or4y4k2p04FEfSMWIVs */
  val i = 4
  val result: Boolean = (i == 2)
  val result2 = i == 2
  val result3: Any = if (false) "good" else {
    ()
  }
  //In scala we can't write (condition ? result : otherwiseResult) instead of that we should write if/else
  val result4: String = if (false) "good" else "bad"
  val result5 = if (i == 3) "good" else "bad"


  def wannaEatIcecreamOrWatchMovie(icecream: Boolean, movie: Boolean): String = {
    if (icecream && movie)
      "Sooooo coool" else if (icecream || movie)
      "still cool buddy" +
        "   yeah!"
    else
      "boring"
      "I am not interested in!!!"
  }

  println(wannaEatIcecreamOrWatchMovie(icecream = false, movie = true))
  //We could join two string with plus!
  println(wannaEatIcecreamOrWatchMovie(icecream = false, movie = false))

  //As you can see the result will be "I am not interested in!!!"(the last line)
  def wannaEatIcecreamOrWatchMovieByScala3(icecream: Boolean, movie: Boolean): String =
    if (icecream && movie)
      "Sooooo coool" else if (icecream || movie)
    //use aligned intendation instead of perantises
      "still cool buddy" +
        "  scala3  yeah!"
    else
      "boring"
      "I am not interested in!!!"
    //next line is Optional
    end if
  //next line is Optional
  end wannaEatIcecreamOrWatchMovieByScala3

  println(wannaEatIcecreamOrWatchMovieByScala3(icecream = false, movie = true))

  def wannaEatIcecreamOrWatchMovieBySomeCleanCode(icecream: Boolean, movie: Boolean): String =
    val iceCreamEtedOrMovieWatchedMessage: String =
      if (icecream && movie)
        "Sooooo coool"
      else if (icecream || movie)
        "still cool buddy" +
          "  scala3  yeah!"
      else
        "boring"
        "I am not interested in!!!"
      end if
    //we could use parantises and end together
    iceCreamEtedOrMovieWatchedMessage
  end wannaEatIcecreamOrWatchMovieBySomeCleanCode

  //Avoid using magic values, The numbers we use Among our code without defining variables
  //something like a>0 is not so good, we should define something like zeroNumber:Integer
  // It can creat some situation for changing this variable in Observing clean code
  //todo some note about mock and translation microserrvices
  println(1377 == 1337) //it prints false
  println(1377 != 1337) //it prints true
  println(1377 >= 1337) //it prints true
  println(1377 <= 1337) //it prints true
  println(1377 < 1337) //it prints false
  println("test" == "test") //== and !== compare VALUES OF VARIABLE DESPITE OF JAVA! IN JSVS THEY USE FOR referense!
  println("test" == "test") //it prints true
  //in java it would be refrential equality,whitch means equality of references, In that case when you want to
  //compare values you should compare them  by equal
  println("test" eq "test") //it just compare referenences
  println("test" ne "test") //it just compare referenences


  //print("test"==1) => we can not code this because compiler don't let us(typeSafety):Values of types String and Int cannot be compared with == or !=
  //print("test" eq 1) //=> we can not code this because compiler don't let us, becaue when type of two variable is different
  //clearly their reference are different

  /*There are additionally two flavors of type safety: static and dynamic. If you say that a "program"
  is type safe, then you are commenting on static type safety. That is, the program will not have type
   errors when it runs. You can also say that a "language" or "language implementation" is type safe, which
    is a comment on dynamic type safety. Such a language or implementation will halt before attempting
     any invalid operation I mean it checks in compile time.*/
  /*Type safety is checking for matched data types during compile time. For example int a ="John" returns
   error as variable 'a' is an integer and we are assigning a string value. These data type mismatches are
  checked during compile time. https://stackoverflow.com/questions/3593632/what-is-typesafe-in-vb-net*/

  //languages: static type, dynamic type, multi
  //static types languages means once you define a variable the type of that doesnt change forever,but dynamic types means
  //the types of variable can change in runtime, it cause less bugs for the future,dynamic languages like python or php
  //todo what is supertypesafe? perhaps it means very typesafe
  //todo How to make typeSafe variables?
  println(!true)
  println(true || false)
  println(true && false)

end CrashCourse //=> use ":" in start and use "end+name" in end of section

object Crashcourse2 extends App {

  @tailrec
  def loop(acc: Int = 0): Unit = {
    if (acc < 10) {
      println("hi")
      loop(acc + 1)
    }
  }
  //the function should have recursivecall for using @tailRec
  //  @tailrec
  //  def lpo():Unit={1}
  //error: TailRec optimisation not applicable, method lpo contains no recursive calls

  def higherOrderFunction(f: Int => String) = {
    var acc = 0
    while (acc < 10) {
      println(f(acc))
      acc += 1
    }
  }

  def rendered(n: Int): String =
    Console.YELLOW + n + Console.RESET

  higherOrderFunction(rendered)
  List(1, 2, 3).map(a => println(a))
  List(1, 2, 3).map(println(_)) //=>
  List(1, 2, 3).map(println)
  List(1, 1, 3).foreach(println)
  List(1, 1, 3).foreach(println)
  // why foreach defined as this:def foreach[U](f: A => U): Unit
  //because of defining generics in method
  List(1, 1, 3).foreach[Unit](println)
  //  List(1, 1, 3).foreach[Int](println)
  //  List(1, 1, 3).foreach[String](println) =>error because of generic types and setting [unit]
  //this is optional and the purpose is controlling type
  //example:
}

class Crashcourse2[U] {

  def exampleOsSpecificCaseInGenerics[Z](input1: U, input2: Z): String = input2.toString + input2.toString
  //  exampleOsSpecificCaseInGenerics[Int,Double](2,5.12)
  //  exampleOsSpecificCaseInGenerics(2,5.12)
}

object Test extends App {
  val tinyCrashcourse = new Crashcourse2[String]

  //  tinyCrashcourse.exampleOsSpecificCaseInGenerics[Double](10,10)=> not similar types for
  //  generics=>type safety of scala is obvious hear!
  tinyCrashcourse.exampleOsSpecificCaseInGenerics[Double]("Sahar.Kz", 10)

}

object MapDataTyoe extends App {
  //map as method is compeletely different whit Map(Datat Type)
  val stdNumberList: List[Int] = List(8798, 8989, 8985, 1245, 1245) //can have repeate despite set
  val scalaCourseDscp: Option[String] = Option("This is the Scala course")
  //In previouse line first Option is type, second option is constructor
  val mathCourseDscrp: Option[String] = None
  val lendedBookByStdNumber: Map[Int, String] = Map(8798 -> "Harry Potter", 8989 -> "Lovely Bones", 8985 -> "Hock Elberyphin", 1245 -> "TomSayer", 1245 -> "Qhoran")

  //transforming/translating data using map:
  val newTenYearsAddedStdNmbrList: List[Int] = stdNumberList.map(_ + 100) //it add 10 years to every stdNumber
  val newScalaCourseDscMohandesAdded: Option[String] = scalaCourseDscp.map(_ + " By mohandes E.BB")
  val newMathCrsDsc: Option[String] = mathCourseDscrp.map(x => x + "math course by dr.HashemAbadi")
  val shokofehLibraryLendedBookByStdNum: Map[Int, String] = lendedBookByStdNumber.map { case (x, y) => (x, y + ", Shokofeh Library") }
  val shokofehLibraryLendedBookByStdNum2: Map[Int, String] = lendedBookByStdNumber.map(xy => (xy._1, xy._2 + ", ShokoufehLibrary 2"))
  val shokofehLibraryLendedBookByStdNum3: Map[Int, String] = lendedBookByStdNumber.map { xy =>
    val (stdNum, lendedBook) = xy //To see how the tuple works see the below example
    (stdNum, lendedBook + ", Shokoufeh Library 3 section")
  }
  // Tuple example
  val tupleExample = ("test", "Hi", 100)
  val test = tupleExample._1
  val hi = tupleExample._2
  val handred = tupleExample._3
  //Tuple extraction process the below example is the simple way to get tuple elements and is the same as above
  val (exTest, exHi, exHandred) = tupleExample


  println("_" * 51)
  println(s"stdNumberList=$stdNumberList")
  println(s"newTenYearsAddedStdNmbrList=$newTenYearsAddedStdNmbrList")
  println("_" * 51)
  println(s"scalaCourseDscp=$scalaCourseDscp")
  println(s"newScalaCourseDscMohandesAdded=$newScalaCourseDscMohandesAdded")
  println("_" * 51)
  println(s"mathCourseDscrp=$mathCourseDscrp")
  println(s"newMathCrsDsc=$newMathCrsDsc")
  println("_" * 51)
  println(s"lendedBookByStdNumber=$lendedBookByStdNumber")
  println(s"shokofehLibraryLendedBookByStdNum=$shokofehLibraryLendedBookByStdNum")
  println(s"shokofehLibraryLendedBookByStdNum2=$shokofehLibraryLendedBookByStdNum2")
  println(s"shokofehLibraryLendedBookByStdNum3=$shokofehLibraryLendedBookByStdNum3")
  println("_" * 51)
  println(s"tupleExample=$tupleExample")
  println(s"test=$test")
  println(s"hi=$hi")
  println(s"handred=$handred")
  println(s"exTest=$exTest")
  println(s"exHi=$exHi")
  println(s"exHandred=$exHandred")
  //todo some and none-what is Map and tuple and their methods
  //todo what is map and container
  //todo differ between hashmap in java and map
  //todo how to define cash by var and map for DB
  //todo What is none type and can we have no type for it?
  //todo to some discussion on what printed in consule
}

