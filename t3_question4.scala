import scala.compiletime.ops.float
object question4 extends App{
    def discount(bookPrice: Float)={
        bookPrice * 0.4
    }

    def discounted_Price_of_aBook(bookPrice:Float):Double={
        bookPrice - discount(bookPrice)
    }
    
    def cost_of_books(no_of_books:Int, bookPrice:Float):Double = {
        no_of_books * discounted_Price_of_aBook(bookPrice)
    }

    def shipping_cost(no_of_books:Int):Double=
        
        if(no_of_books >=50){
            3 * 50 + 0.75 * (no_of_books-50)
        }
        else{
            3 * no_of_books
        }
    
    
    def whole_sale_price(no_of_books:Int,bookPrice:Float):Double = {
        cost_of_books(no_of_books,bookPrice) + shipping_cost(no_of_books)
    }

    println(whole_sale_price(60 , 24.95))
}