fun main() {
    val likes = (1..200).random()
    val people =  if (likes == 1 || (likes%10 == 1 && likes != 11)) "человеку" else "людям"
    println("Понравилось $likes $people")
}