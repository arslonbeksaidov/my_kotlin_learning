fun main() {
    val names = listOf<String>("Emma", "Kim")
    val list = buildList<String> {
        add("Marta")
        addAll(names)
        add("Marta")
    }
//    print(list)
//    val partyList = listOf("Fred", "Emma", "Isabella", "James", "Olivia")
//    if (!partyList.isEmpty()) {
//        val size = partyList.size
//        val whoIsFirst = partyList[0]
//        println("The party will not be lonesome! We already got $size people. And $whoIsFirst was the first to arrive today!")
//        // The party will not be lonesome! We already got 5 people. And Fred was the first to arrive today!
//    }

//
//    fun solution(products: List<String>, product: String) {
//        products.forEachIndexed { index, ele ->
//            if (ele == product) {
//                print("$index ")
//            }
//        }
//    }
}