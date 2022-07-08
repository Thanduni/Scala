// import scala.quoted.Quotes.reflectModule.defnModule
object  question_4b extends App{
    
        def No_attendees(ticket_price: Int)= 120 + (15 - ticket_price)/5*20

        def revenue(ticketPrice: Int)= No_attendees(ticketPrice) * ticketPrice

        def cost(price: Int)= 500 + 3 * No_attendees(price)

        def profit(price: Int)= revenue(price)- cost(price)

        println(profit(10))
        println(No_attendees(10))
        println(revenue(10))
        println(cost(10))

}