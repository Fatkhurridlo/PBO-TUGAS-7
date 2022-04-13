interface Vehicle {
    fun start()
    fun stop()
}

class Car : Vehicle {
    override fun start()
    {
        println("Mobil Jalan")
    }

    override fun stop()
    {
        println("Mobil Berhenti")
    }
}

fun main()
{
    val obj = Car()
    obj.start()
    obj.stop()
}
