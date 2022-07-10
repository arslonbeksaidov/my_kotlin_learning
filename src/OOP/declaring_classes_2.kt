package OOP
//class Size(val width: Int, val height: Int) {
//    init {
//        println("Initializer block that prints the width ($width) and the height ($height)")
//    }
//}

//-----------------------------------------------
//class Size(_width: Int, _height: Int) {
//    // 1: the width property is initialized
//    val width = _width
//
//    // 2: 1st init block is executed
//    init {
//        println("First initializer block that prints the width $width")
//    }
//
//    // 3: the height property is initialized
//    val height = _height
//
//    // 4: 2nd init block is executed
//    init {
//        println("Second initializer block that prints the height $height")
//    }
//
//    // 5: the area property is initialized
//    val area = width * height
//}
//---------------------------------
//class VinylStore(var vinyl: String) { // to'g'ridan to'g'ri propertini declare qilsa bo'ladi
//    fun printVinyl() {
//        println(this.vinyl)
//    }
//}
//---------------------------------
class Counter(_age: Int){
    var age:Int = 0
    var incrementor_primary = 0
    init {
        println("top___${age}")
        println("top___${_age}")
        age+= _age
        println("bottom___${age}")
        println("bottom___${_age}")

        incrementor_primary+= _age
    }
}

fun main() {
    val Counter = Counter(_age = 8)
    println(Counter.age)
    Counter.age+=10
    Counter.age+=10
    println(Counter.age)

    Counter.incrementor_primary+=1
    println(Counter.incrementor_primary)
    val Counter2 = Counter(_age = 9)
    Counter2.incrementor_primary+= 10
    println(Counter2.incrementor_primary)
    println(Counter2.incrementor_primary)



//    val Size = Size(width = 3, height = 9)
//
//-----------------------------------------
//    val Size = Size(_height = 5, _width = 9)
//    println(Size.width)
//    println(Size.height)
}