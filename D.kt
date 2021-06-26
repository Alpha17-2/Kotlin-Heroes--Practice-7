 import java.util.Scanner
fun main() {
    val reader = Scanner(System.`in`)
    var n:Int = reader.nextInt()
    var skills: MutableList<Int> = mutableListOf()
    for (i in 0 until n)
    {
        var num:Int = reader.nextInt()
        skills.add(num)
    }
    skills.sort()
    var ans=0
    var current = 0
    while(current<n)
    {
        ans += (skills.get(current+1) - skills.get(current))
        current+=2
    }
    print(ans)
}
