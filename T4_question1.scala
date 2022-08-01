object question1 extends App{
    def interest(deposit:Int)=deposit match{
        case x if x < 20000 => x*0.02;
        case x if x < 200000 => x* 0.04;
        case x if x < 2000000 => x * 0.035;
        case x if x > 2000000 => x * 0.065;
    }

    println("interset: " + interest(14000));
    println("interset: " + interest(140000));
    println("interset: " + interest(1400000));
    println("interset: " + interest(14000000));
}