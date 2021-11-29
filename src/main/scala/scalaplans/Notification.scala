package scalaplans

//Traits and classes can be marked sealed which means all subtypes must be declared in the same file. This assures that all subtypes are known.
//ADT=ALGEBRIC DATA Type
//this kind of setting types and defining them called ADT
abstract class Notification

case class Email(sender: String, title: String, body: String) extends Notification

case class SMS(caller: String, message: String) extends Notification

case class VoiceRecording(contactName: String, link: String) extends Notification

object Notification{
  def filterValues(filter: Notification): String = filter match {
    case Email(_,_,_) => "Filter by date"
  }
}


