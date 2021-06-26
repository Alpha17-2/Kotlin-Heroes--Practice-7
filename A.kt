import java.util.Scanner
fun main() {
    val reader = Scanner(System.`in`)
    var integer:Int = reader.nextInt()
    while (integer-- > 0){
        var a:Int = reader.nextInt();
        var b:Int = reader.nextInt();
        println(a+b)
    }
} 
