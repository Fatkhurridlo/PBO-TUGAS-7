class Orang {

    // name of the companion object is omitted
    companion object {
        fun callMe() = println("Ini Companion")
    }
}

fun main(args: Array<String>) {
    Orang.callMe()
}