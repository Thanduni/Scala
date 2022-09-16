import math.{sqrt,pow}
case class Point(a:Int, b:Int){
    //in case class input parameters are automatically make as values

    def +(that:Point)= Point(this.a + that.a, this.b +that.b)

    def move(dx:Int, dy:Int)=Point(this.a+dx , this.b+dy)

    def distance(p:Point) = sqrt(pow(a-p.a,2)+ pow(b-p.b,2))

    def invert() = Point(b,a)

}
object caseClass extends App{
    //no new keyword is required
    val p1 = Point(2,4)
    val p2 = Point(6,2)

    println(p1)
    println(p2)
    println()
    
    println(p1+p2)

    println(p1.move(2,2))
    
    println(p1.distance(p2))

    println(p1.invert())
}