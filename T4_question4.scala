object question4 extends App{
    
    def patternMatching(num: Int)= num match{
        case x if x <0  => println("Negative")
        case x if x == 0 => println("Zero")
        case x if (x>0) && (x%2 ==0) => println("Even number")
        case x if x >0 && x %2 !=0 =>printf("Odd number")
    }

    print("Enter a number: ")
    //println("Enter a number: ")
    val input = scala.io.StdIn.readInt()    //accepts only intergers as inputs
    patternMatching(input)
    
}