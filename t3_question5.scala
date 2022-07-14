object question5 extends App {
    def easy_pace(easy_distance:Int) = {
        easy_distance * 8
    }

    def tempo_pace(tempo_distance:Int) = {
        tempo_distance * 7
    }

    def total_time(easy_distance:Int,tempo_distance:Int)={
        easy_pace(easy_distance) + tempo_pace(tempo_distance)
    }

    println(total_time(2,3))
    
}