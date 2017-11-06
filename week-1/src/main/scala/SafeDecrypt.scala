import scala.io.StdIn

object SafeDecrypt extends App {

  val atoz = 'a' to 'z'
  val alphabet = atoz.mkString // abcd..wxyz

  def rotate(s: String, n: Int): String = s.drop(n) + s.take(n)

  val shift = 3

  val cipherstrip = rotate(alphabet, shift) // defg..zabc

  def decc(c: Char): Char = {
    val index = cipherstrip.indexOf(c)
    if (index < 0) {
      // if it is not a lower-case letter leave it unchanged
      c
    } else {
      val d = alphabet.charAt(index)
      d
    }
  }

  def decs(s: String): String = {
    s.map(decc)
  }

  println("Enter a message:")

  val message = StdIn.readLine()

  println("Decrypting...")

  println(decs(message))
}
