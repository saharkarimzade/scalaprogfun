package scalaplans
//Traits and classes can be marked sealed which means all subtypes must be declared in the same file. This assures that all subtypes are known.
abstract class Notification

case class Email(sender: String, title: String, body: String) extends Notification

case class SMS(caller: String, message: String) extends Notification

case class VoiceRecording(contactName: String, link: String) extends Notification

object Notification{
  def filterValues(filter: Notification): String = filter match {
    case Email(_,_,_) => "Filter by email"
  }
}
val AliceSMS: SMS = SMS("Alice", "Hi Alice")
//case class has some methods like apply then you can remove new in creating object

//this part of code create match error!
//filterValues(AliceSMS)

