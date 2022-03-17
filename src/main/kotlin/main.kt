fun main() {

    val likes = (1..1000).random()

    val people =
        if (likes % 100 == 11)
            "людям"
        else if (likes == 1 || likes % 10 == 1 && likes != 11)
            "человеку"
        else
            "людям"

    println("Понравилось $likes $people")
}