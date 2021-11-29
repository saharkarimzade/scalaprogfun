package scalaplans

object MatchCaseSample  extends  App {

  def showImportantNotification(notification: Notification, importantPeopleInfo: Seq[String]): String = {
    notification match {
      case Email(sender, _, _) if importantPeopleInfo.contains(sender) =>
        "You got an email from special someone!"
      case SMS(number, _) if importantPeopleInfo.contains(number) =>
        "You got an SMS from special someone!"
      case other =>
        showNotification(other) // nothing special, delegate to our original showNotification function
    }
  }
  def showNotification(notification: Notification): String = {
    notification match {
      case Email(sender, title, _) =>
        s"You got an email from $sender with title: $title"
      case SMS(number, message) =>
        s"You got an SMS from $number! Message: $message"
      case VoiceRecording(name, link) =>
        s"You received a Voice Recording from $name! Click the link to hear it: $link"
    }
  }
  val someSms = SMS("12345", "Are you there?")
  val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")

  println(showNotification(someSms))  // prints You got an SMS from 12345! Message: Are you there?

  println(showNotification(someVoiceRecording))  // prints You received a Voice Recording from Tom! Click the link to hear it: voicerecording.org/id/123


//Matching on type only
  def findType(myType: Any): String = myType match {
    case p: String => "String"+p
    case c: Integer => "Integer"
  }

  def findType3(myType: Any): String = myType match {
    case oldsystemAge: String => "String"



    case newSystemAage: Integer => "Integer"+newSystemAage
  }
//in every match case execute a partial function
  def findType2(myType: Any): String = myType match {
    case _: String => "String"
    case _: Integer => "Integer"

  }

  //what is the diff between findtype1,2,3: nothing! it can just healp the readability of
  // code! the edge of every case is totally differnt with the next case!
  println( findType("4"))
  println( findType2("4"))
  println( findType3(4.454345))


  //TODO match case exhust


//  filterValues(s: SMS)
//  val l = "1" :: "2" :: Nil
//  l.sliding(2).foreach{case List(a,b) => }

  //(Nil is an empty singleton object list that extends the List type,
  // therefore, it has all fields and methods that any other List object has,
  // and it’s usually used to initialize empty lists)

}
