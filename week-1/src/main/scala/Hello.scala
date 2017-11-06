import scala.io.StdIn

object Hello extends App {
  println("What is your name?")
  val name = StdIn.readLine()
  println("Hello, " + name)
}
