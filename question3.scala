object question3 extends App{

    var a =2
    var b=3
    var c=4
    var d=5
    var k =4.3f
    var g = 4.0f
    
    //values in Scala can not be incremented or decremented
    
    //println(--b * a + c * d--)   
    b-=1
    println(b*a+c*d)
    d-=1
    
    //println(a++)
    println(a)
    a+=1
    
    //println(-2 * (g - k) + c)
    println(-2 * (g - k) + c)
    
    //println(c == c++)
    println(c==c)
    c+=1
    
    //println(c == ++c * a++)
    c+=1
    println(c==c*a)
    a+=1
}
