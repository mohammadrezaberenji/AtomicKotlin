
fun main() {

    var a = 10
    val b = -5
    var result: Int


    FirstChapter.showRange(10 downTo  0 step 3)

    FirstChapter.iterateOverString("Hi Kotlin")

    FirstChapter.hasChar("kotlin", 'k')

    FirstChapter.hasCharBooleanReturn("kotlin", 's')

    println("is digit : ${FirstChapter.isDigit('c')}")



    FirstChapter.reverse("Abgh")

    highOrder { a: Int, b: Int -> a + b }


}


fun highOrder(lambda: (Int, Int) -> Int) {
    var result = lambda(2, 4)
    println("highOrder : result is $result")



}


