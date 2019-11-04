// shekmna


//class MyClass<T>(text: T) {
//    var name = text
//}



// Class-i generic-gareshe

//class Company (text: String) {
//    var x = text
//    init{
//        println(x)
//    }
//}
//fun main(args: Array<String>){
//    var name: Company = Company("GeeksforGeeks")
//    var rank: Company = Company(12)// compile time error
//}



// class-i generic-ebit

//class Company<T> (text : T){
//    var x = text
//    init{
//        println(x)
//    }
//}
//fun main(args: Array<String>){
//    var name: Company<String> = Company<String>("shualeduri shefaseba")
//    var rank: Company<Int> = Company<Int>(30)
//}



//array into another

//fun copy(from: Array<out Any>, to: Array<Any>) {
//    assert(from.size == to.size)
//    // copying (from) array to (to) array
//    for (i in from.indices)
//        to[i] = from[i]
//    // printing elements of array in which copied
//    for (i in to.indices) {
//        println(to[i])
//    }
//}
//fun main(args :Array<String>) {
//    val ints: Array<Int> = arrayOf(1, 2, 3)
//    val any :Array<Any> = Array<Any>(3) { "" }
//    copy(ints, any)
//
//}


//Star Projection

//// star projection in array
//fun printArray(array: Array<*>) {
//    array.forEach { print(it) }
//}
//fun main(args :Array<String>) {
//    val name = arrayOf("Jalabadze-","Aroshidze-","Chuxua")
//    printArray(name)
//}



