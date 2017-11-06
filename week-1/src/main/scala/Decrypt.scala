import scala.io.StdIn

object Decrypt extends App {

  val atoz = 'a' to 'z'
  val alphabet = atoz.mkString // abcd..wxyz

  def rotate(s: String, n: Int): String = s.drop(n) + s.take(n)

  val shift = 3

  val cipherstrip = rotate(alphabet, shift) // defg..zabc

  def decc(c: Char): Char = {
    val index = cipherstrip.indexOf(c)
    val d = alphabet.charAt(index)
    d
  }

  def decs(s: String): String = {
    s.map(decc)
  }

  println("Enter a message:")

  val message = StdIn.readLine()

  println("Decrypting...")

  println(decs(message))
}