fun main() {
//    val mutList2D = mutableListOf(
//        mutableListOf<Int>(1, 2, 3, 4, 5, 6),
//        mutableListOf<Int>(1, 2, 3, 4, 5, 6),
//        mutableListOf<Int>(1, 2, 6, 4, 8, 6)
//    )
//    println(mutList2D[0])
//    println(mutList2D[0][1])
//
//    val difList2D = mutableListOf(
//        mutableListOf<Int>(1, 2, 3, 5, 6),
//        mutableListOf<String>("dfdfdf", "dfdfdf", "dfdfd"),
//        mutableListOf<Char>('d', 'd', 'd'),
//        mutableListOf<Double>(1.2, 5.8, 8.9),
//    )
//
//    val mutList3D = mutableListOf(
//        mutableListOf(
//            mutableListOf<Int>(1, 2, 3, 4, 5, 6),
//            mutableListOf<String>("wewe", "dfdf","Kitob"),
//            mutableListOf<Char>('d', 'd')
//        ),
//        mutableListOf(
//            mutableListOf<String>("dfdf","dfdfdfdfdf","Arslon"),
//            mutableListOf<String>("wewe", "dfdf","Saidov"),
//            mutableListOf<Char>('d', 'd','b')
//        )
//    )
//
//    println(mutList3D[0][1][2])
//
//    println(difList2D[1][2])
//    println(difList2D[0].joinToString())
//    println(difList2D)


    //Do not touch code below
//    var inputList: MutableList<MutableList<String>> = mutableListOf()
//    val n = readLine()!!.toInt()
//    for (i in 0 until n) {
//        val strings = readLine()!!.split(' ').toMutableList()
//        inputList.add(strings)
//    }
//   println("${inputList[0][0]} ${inputList[0][n-1]}")
//   println("${inputList[0][0]} ${inputList[n-1][n-1]}")
    //write your code here


//    val mutList3D = mutableListOf(
//        mutableListOf(
//            mutableListOf<Int>(0,0,0),
//            mutableListOf<Int>(0,0,0),
//            mutableListOf<Int>(0,0,0),
//        ),
//        mutableListOf(
//            mutableListOf<Int>(0,0,0),
//            mutableListOf<Int>(0,0,0),
//            mutableListOf<Int>(0,0,0),
//        ),
//        mutableListOf(
//            mutableListOf<Int>(0,0,0),
//            mutableListOf<Int>(0,0,0),
//            mutableListOf<Int>(0,0,0),
//        ),
//    )
//    println(mutList3D)

//    or
//    val list = MutableList(3) { MutableList(3) { MutableList(3) { 0 } } }
//    println(list)

//    var inputList: MutableList<MutableList<String>> = mutableListOf()
//    val n = readLine()!!.toInt()
//    for (i in 0 until n) {
//        val strings = readLine()!!.split(' ').toMutableList()
//        inputList.add(strings)
//    }
//    println(inputList[2].joinToString   (", "))


//    val mutList2x3 = mutableListOf(
//        mutableListOf(
//            "[0][0]",
//            "[0][1]",
//            "[0][2]",
//        ),
//        mutableListOf(
//            "[1][0]",
//            "[1][1]",
//            "[1][2]",
//        ),
//    )
//    println(mutList2x3)

//    or
//    val mutList: MutableList<MutableList<String>> = mutableListOf()
//
//    for (i in 0..1) {
//        val innerMutList: MutableList<String> = mutableListOf()
//        for (j in 0..2) {
//            innerMutList.add("[$i][$j]")
//        }
//        mutList.add(innerMutList)
//    }
//
//    println(mutList)
}