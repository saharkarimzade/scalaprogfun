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
  //We can call private members despite of ExmineModifire3 because of extending
  val mm=new ExamineModifiers2
  mm.myProtectedMsg2ByseetingPackage
  mm.myPublic2
    
  val cc=new ExamineModifiers3
  cc.myPublic3
  cc.myProtectedMsg3
  cc.nn 
//There is some Ther consept: The only way to access the member of a class is Object!
//  As I told in Samleclass file we can introduse object in 2 way:
//  +keyword new
//  +companion object 
//   you have access the member of that class
//  by companien Object you have just the members of that object
}