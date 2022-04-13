// base class
open class A {
    // protected variable
    open protected val int = 10

}

// derived class
class B: A() {
    override val int = 20
    fun getvalue():Int {
        // accessed from the subclass
        return int
    }
}

fun main(args: Array<String>) {
    var a = B()
    println("The overridden value of integer is: "+a.getvalue())
}
