import scala.io.StdIn

object Encrypt extends App {

  val atoz = 'a' to 'z'
  val alphabet = atoz.mkString // abcd..wxyz

  def rotate(s: String, n: Int): String = s.drop(n) + s.take(n)

  val shift = 3

  val cipherstrip = rotate(alphabet, shift) // defg..zabc

  def encc(c: Char): Char = {
    val index = alphabet.indexOf(c)
    val e = cipherstrip.charAt(index)
    e
  }

  def encs(s: String): String = {
    s.map(encc)
  }

  println("Enter a message:")

  val message = StdIn.readLine()

  println("Encrypting...")

  println(encs(message))
}
