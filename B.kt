import java.util.Scanner
fun main() {
    val reader = Scanner(System.`in`)
    var testCases:Int = reader.nextInt()
    while (testCases-- > 0){
        var a:Long = reader.nextLong()
        var b:Long = reader.nextLong()
        var k:Long = reader.nextLong()
        var ans:Long = 0
        if(k%2==0L)
            ans = ((k/2)*a) - ((k/2)*b)
        else
            ans = (((k/2)+1)*a) - ((k/2)*b)
 
        println(ans)
    }
}
 
