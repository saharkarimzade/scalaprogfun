object CrashCourse extends App {
  //Some scala practice based on  https://www.youtube.com/watch?v=-xRfJcwhy7A&list=PLJGDHERh23x9Y1Or4y4k2p04FEfSMWIVs
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
  println("test" == "test")
  println("test" == "test") //it prints true
  //in java it would be refrential equality,whitch means equality of references, In that case when you want to
  //compare values you should compare them  by equal
  println("test" eq "test")
  println("test" ne "test")


}