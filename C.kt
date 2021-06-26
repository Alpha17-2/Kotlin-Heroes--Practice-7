import java.util.Scanner
fun main() {
    val reader = Scanner(System.`in`)
    var testCases:Int = reader.nextInt()
    while (testCases-- > 0){
        var n = reader.nextInt()
        var k = reader.nextInt()
        var s:String=""
        var avg=0
        var character:Char = 'a'
 
        avg = n/k
        for (i in 1..k)
           {
             for(j in 1..avg)
               {
                  s += character
               }
               character++
           }
        character--
        for(i in 1..(n%k))
        {
            s+=character
        }
        println(s)
 
    }
} 
