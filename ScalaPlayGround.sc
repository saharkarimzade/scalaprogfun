import scala.annotation.tailrec

/*It's a simple example of methods in scala*/
def sum(x: Int,y:Int)=x+y
sum(2,4)
/*It is a simple example of functions in scala*/
val myFunc=(r:Int)=>(r+1)
myFunc(4)
var x=2;
val k=3.4
println(x+k)
/**
 * reassignment to val is not true then if you code "k=8" compiler recognize false coding
 */
// k=3
/**
 * but reassignment to the var is ok
 */
x=7


/**
 * An example of tail recursive
 * It happens when last operation of the method
 * is just that method!!In this Example when I use tailRecfactorial(x-1)*x instead of
 * tailRecfactorial(x-1) compiler doesnt approve it as  tail recursive!
 * @param x
 * @return
 */
@tailrec
def tailRec(x:Int):Int= {
  if x==0 then 1 else
    tailRec(x-1)
}

def NottailRecfactorial(x:Int):Int= {
  if x==0 then 1 else
    NottailRecfactorial(x-1)*x
}

NottailRecfactorial(3)









