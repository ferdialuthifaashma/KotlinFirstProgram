fun main(args: Array<String>) {
    val s = "Rhinopotamus"
    println(s.startsWith("rhin"))
    println(s.endsWith("tamus"))
    println(s.contains("pot"))
    println(s.contains("lol"))

    var config = "Fullscreen shaDows autosave"
    config = config.toLowerCase()
    println(config.contains("fullscreen"))
    println(config.contains("shadows"))
    println(config.contains("nosound"))
    println(config.contains("autosave"))

    var strJava = "Java is the best!"
    strJava = strJava.replace("Java", "Kotlin")
    println("$strJava is ${strJava.length} characters long.")

    println("I would not banish all of these Internets.".substring(2, 7))
    println("alpha".compareTo("bravo"))
}

