package MyPackage

class ExamineModifiers3{
  private[MyPackage] def myProtectedMsg3="1213"
  var myPublic3="1213"
  private var myPrivate3="1213"
  val nn=new ExamineModifiers2();
  nn.myPublic2
  nn.myProtectedMsg2ByseetingPackage
    
}
class Child extends ExamineModifiers2
{
  //We can call protected members despite of ExmineModifire3 because of extending
  val mm=new ExamineModifiers3
  mm.myProtectedMsg3
  mm.myPublic3
    
}