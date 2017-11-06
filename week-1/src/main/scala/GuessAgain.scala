import scala.io.StdIn
import scala.util.Random

object GuessAgain extends App {
  val random = Random.nextInt(10) + 1

  // var - you can change its value
  var guessed = false

  do {

    println("Guess the number:")
    val num = StdIn.readInt()

    if (num == random) {
      println("Correct!")
      guessed = true
    } else {
      println("Incorrect.")
    }

  } while (guessed == false)
}
