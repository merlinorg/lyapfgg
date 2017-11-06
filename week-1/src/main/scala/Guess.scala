import scala.io.StdIn
import scala.util.Random

object Guess extends App {
  val random = Random.nextInt(10) + 1

  println("Guess the number:")
  val num = StdIn.readInt()

  if (num == random) {
    println("Correct!")
  } else {
    println("Incorrect.")
  }
}
