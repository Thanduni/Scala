object Cipher extends App {
    printf("Enter string: ")
    var text = scala.io.StdIn.readLine()

    printf("Enter shift: ")
    var shift = scala.io.StdIn.readInt()

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val encryption = ((c: Char) => {
        val x = alphabet.indexOf(c.toUpper)
        if(x == -1){
            c
        }
        else{
            alphabet((x+shift)%alphabet.size)
        }
    })

    val decryption = ((c: Char) =>{
        val x = alphabet.indexOf(c.toUpper)
        alphabet((x-shift)%alphabet.size)
    })

    val Cipher = (func:(Char)=>Char, s:String)=>s.map(func(_))

    println(Cipher(encryption,text))

}