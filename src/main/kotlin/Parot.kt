fun main(args: Array<String>) {
    println("Hi I'm Lora, the virtual parrot, and I love to repeat!")
    println("Type something in:")

    var input: String = readLine()!!
    var output: String = input + ", " + input + "!"
    println(output)
}
