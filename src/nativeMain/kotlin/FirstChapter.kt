class FirstChapter {

    companion object {

        fun showRange(intProgression: IntProgression) {
            for (i in intProgression) {
                println(" i is : $i")
            }
        }


        fun iterateOverString(string: String) {
            for (s in string) {
                println("char is : $s")
            }
        }


        fun hasChar(string: String, char: Char) {
            for (s in string) {
                if (s == char) {
                    println("char founded : $char")
                }
            }
        }

        fun hasCharBooleanReturn(string: String, char: Char) {
            println(char in string)
        }

        fun isDigit(char: Char) = char in '0'..'9'

        fun confusingCode() {
            /*
                * “Using increment and decrement operators within other expressions is discouraged because it can produce confusing code:”
             */
            var i = 1
            println(i++ + ++i)
        }

        fun reverse(string: String){
            var reversed = ""
            val list = string.toCharArray()
            for (items in list.size -1 downTo 0){
                reversed += list[items]
            }

            println("reversed : $reversed")
        }

    }
}