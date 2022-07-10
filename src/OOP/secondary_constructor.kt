package OOP

//class Size {
//    var height = 0
//    var width = 0
//
//    constructor(_width: Int, _height: Int){
//        width = _width
//        height = _height
//    }
//}
//-----------------------------------------
//class Size {
//    var width: Int = 0
//    var height: Int = 0
//
//    constructor(_height: Int) {
//        height = _height
//    }
//
//    constructor(_width: Int, _height: Int) {
//        width = _width
//        height = _height
//    }
//
//    constructor(_width: Int, _height: Double) {
//        width = _width
//        height = _height.toInt()
//    }
//
//    constructor(_height: Double, _width: Int) {
//        width = _width
//        height = _height.toInt()
//    }

class Size(val width: Int, val height: Int) {
    var area: Int = width * height

    init {
        println("Object with area equal to $area is created")
    }

    constructor(width: Int, height: Int, outerSize: Size) : this(width, height) {
        outerSize.area -= this.area
        println("Updated outer object's area is equal to ${outerSize.area}")
    }
}
//}
//------------------------------------------------

fun main() {
//val Size = Size(3,5)
//    println(Size.height)
//    println(Size.width)
//    ----------------------------------
//    val size1 = Size(7) // uses 1st constructor
//    val size2 = Size(0, 7) // uses 2nd constructor
//    val size3 = Size(0, 7.0) // uses 3rd constructor
//    val size4 = Size(7.0, 0) // uses 4th constructor
//    ---------------------------------------------
//class Size {
//    var width: Int = 0
//    var height: Int = 0
//
//    constructor(width: Int, height: Int) {
//        this.width = width
//        this.height = height
//    }
//}
//    ---------------------------------------------

    val outerObject = Size(5, 8)
    val innerObject = Size(2, 3, outerObject)
}