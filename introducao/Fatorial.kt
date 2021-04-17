fun main(args: Array<String>) {
    var time = System.currentTimeMillis()
    var num: Int = 5

    println("Fatorial de $num = ${fact(num)}")
    println("A função fact executou em ${System.currentTimeMillis() - time} ms\n")

    time = System.currentTimeMillis()
    println("Fatorial de $num = ${factFaster(num)}")
    println("A função factFaster executou em ${System.currentTimeMillis() - time} ms")

}

fun fact(k: Int): Int {
    fun factTail(m: Int, n: Int): Int {
        if (m == 0) return n
        else return factTail(m - 1, m * n)
    }
    return factTail(k, 1)
}

fun factFaster(k: Int): Int {
    tailrec fun factTail(m: Int, n: Int): Int {
        if (m == 0) return n
        else return factTail(m - 1, m * n)
    }
    return factTail(k, 1)
}