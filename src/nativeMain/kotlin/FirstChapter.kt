class FirstChapter {

    companion object {

        fun showRange(intProgression: IntProgression) {
            for (i in intProgression) {
                println(" i is : $i")
            }
        }


        fun iterateOverString(string: String){
            for ( s in string ){
                println("char is : $s")
            }
        }

    }
}