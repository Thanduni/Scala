object Question_4a extends App{
    
    def normal_pay(hours: Int)= hours *250
    def ot_pay(hours:Int)= hours * 85
    def Salary(normalH:Int , otH:Int):Int= normal_pay(normalH) +ot_pay(otH)
    def tax(salary: Int)= salary * 0.12
    def takeHomeSalary(normalH:Int,otH:Int):Double = Salary(normalH,otH) - tax(Salary(normalH,otH))

    println(takeHomeSalary(50,10))
}