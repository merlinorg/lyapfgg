import scala.io.StdIn

object EvenOdd extends App {

  def evenOrOdd(n: Int): String = {
    val remainder = n % 2
    if (remainder == 1) {
      "odd"
    } else {
      "even"
    }
  }

  println("Enter a number:")

  val number = StdIn.readInt()

  val oe = evenOrOdd(number)

  println("The number " + number + " is " + oe)

}
