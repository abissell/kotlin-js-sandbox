fun main(args: Array<String>) {
    val b = B()
    println("Hi, my name is ${b.name()}")
    val a = b as A
    val aStr = a.name()
    println("Hi, my A name is $aStr")
    // Uncomment these two lines and the class C below to see Number inheritance issue
    // val c = C(1234.5678)
    // println(c.toFloat())
    println("Finished!")
}

/*
class C(private val doubleVal: Double) : Number() {

    override fun toByte(): Byte = doubleVal.toByte()
    override fun toChar(): Char = doubleVal.toChar()
    override fun toDouble(): Double = doubleVal
    override fun toFloat(): Float = doubleVal.toFloat()
    override fun toInt(): Int = doubleVal.toInt()
    override fun toLong(): Long = doubleVal.toLong()
    override fun toShort(): Short = doubleVal.toShort()
}
*/
