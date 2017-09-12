import scala.io.StdIn

object Hello extends App {
  println("Enter your name.")
  val name = StdIn.readLine()
  println("Hello, " + name + "!")
}
