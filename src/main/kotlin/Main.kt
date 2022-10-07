import java.util.*

fun main() {
    // комментарий
    /*
    Многострочный
     */
    println("Hello World!")
    val a: Int = 100 // value - immutable
   // val a1 = 100
    //a = 700
    var b = 200 // variable - mutable
    println(a::class)

    val a1: Byte = -10
    val a2: Short = 45
    var c1: Int = -250
    val d1: Long = 3000L

    var h: Double = 4.5
    val f: Float = 4.5F

    var flag: Boolean = true // false
    val ch: Char = 'A'

    val name = "Ivan"
    val sec_name = "Ivanov"

    c1 = d1.toInt()
    h = f.toDouble()

    println("$name $sec_name")

    val x1 = 11
    val y1 = 5
    val z1 = x1/y1 // 2

    val x2 = 11
    val y2 = 5.0
    val z2 = x2/y2 // 2.2

    // % - остаток от деления

    val scanner = Scanner(System.`in`)
    val x = scanner.nextInt()

    // ?. - оператор безопасного вызова

    val y = readLine()?.toInt()
    val yy = readln().toInt()

    val(p1,p2) = readln().split(" ").map { it.toInt() }


    var str: String = "abc"
    str = null

    var str2: String? = "abc"
    str2 = null
    val l1 = if(str2 != null) str2.length else -1
    println(str2?.length)
    println("l1=$l1")
    val l2 = str2?.length ?: -1 // elvis expression
    println(l2)

    var w1 = 5
    var w2 = ++w1
    // w1 = 6; w2 = 6

    var w3 = 5
    var w4 = w3++
    // w3 = 6; w4 = 5

    val g = 10
    if(g == 10) {
        println()
    } else if(g != 100) {

    } else {

    }

    var s = 10
    var p = 20
    var result = if(s > p) {
        println("s>p")
        s
    } else {
        p
    }
    // > < != ==
    // тип логической операции - in
    var q = 5
    var r1 = q in 1..6 // true or false
    var r2 = q !in 100 downTo 2 // [2,100]

    when(flag) {
        true -> {
            // логика 1
        }
        false -> {

        }
        else -> println()
    }
    val m = 10
    when(m) {
        10,20,30 -> println("Or")
        else -> println("...")
    }
    when(m) {
        in 10..19 -> println() // break
        in 20..29 -> println()
        !in 10..20 -> println()
    }
    val j = 10
    val i = 5
    val r = 23
    when(j+i+r) {
        i-r -> println("i-r")
        i+1000 -> println("!!!")
    }
    val sum = 1000
    val rate = when(sum) {
        in 100..999 -> 20
        in 1000..100_000 -> 25
        else -> 5
    }
    val k1 = 15
    val k2 = 6
    when{
        (k1>10) -> {
            // что-то
        }
        k2>100 -> {
            // что-то другое
        }
    }
    when(val kk = k1 + k2){
        800 -> {
            // что-то
        }
        100 -> {
            // что-то другое
        }
    }


}