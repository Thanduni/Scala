import scala.compiletime.ops.string
object question5 extends App{
    def toUpper(input: String)={
        input.toUpperCase()
    }
    def toLower(input: String)={
        input.toLowerCase()
    }
    def formatNames(f: (String)=>String,x: String)={
        val str=f(x)
        print(str)
    }
    
    formatNames(toUpper,"Benny")
    println()
    formatNames(toUpper,"Niroshan".slice(0,2))
    formatNames(toLower,"Niroshan".slice(2,8))
    println()
    formatNames(toLower,"Saman")
    println()
    formatNames(toUpper,"Kumara".slice(0,1))
    formatNames(toLower,"Kumara".slice(1,5))
    formatNames(toUpper,"Kumara".slice(5,6))
} 
