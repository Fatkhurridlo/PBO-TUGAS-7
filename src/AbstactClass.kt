open class Livingthings {
    open fun breathe() {
        println("All living things breathe")
    }
}
abstract class Animal : Livingthings() {
    override abstract fun breathe()
}
class Dog: Animal(){
    override fun breathe() {
        println("Dog can also breathe")
    }
}
fun main(args: Array<String>){
    val lt = Livingthings()
    lt.breathe()
    val d = Dog()
    d.breathe()
}
