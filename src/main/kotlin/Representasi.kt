fun main(args: Array<String>) {
    val a: Int = 10000
    println("a apakah identik dengan a atau a === a : " + (a === a))

    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    println("boxedA === anotherBoxedA : " + (boxedA === anotherBoxedA))
    println("boxedA == anotherBoxedA : " + (boxedA == anotherBoxedA))
}
