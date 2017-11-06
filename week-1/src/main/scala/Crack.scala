import scala.io.StdIn

object Crack extends App {

  val atoz = 'a' to 'z'
  val alphabet = atoz.mkString // abcd..wxyz

  def rotate(s: String, n: Int): String = s.drop(n) + s.take(n)

  def decrypt(c: Char, shift: Int): Char = {
    val cipherstrip = rotate(alphabet, shift) // defg..zabc
    val index = cipherstrip.indexOf(c)
    if (index < 0) {
      c
    } else {
      alphabet.charAt(index)
    }
  }

  def decs(s: String, shift: Int): String = {

    def decc(c: Char): Char = decrypt(c, shift)

    s.map(decc)
  }

  println("Enter a message:")

  val message = StdIn.readLine()

  println("Cracking...")

  // a loop - all the shifts from 0 to 25
  for (shift <- 0 to 25) {
    val decrypted = decs(message, shift)
    println(shift + " - " + decrypted)
  }
}
