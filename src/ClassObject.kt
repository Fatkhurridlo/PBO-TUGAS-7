class myClass {
    // Property (data member)
    private var name: String = "COba class"

    // Member function
    fun printMe() {
        print("ini object" + name)
    }
}
fun main(args: Array<String>) {
    val obj = myClass() // Create object obj of myClass class
    obj.printMe() // Call a member function using object
}