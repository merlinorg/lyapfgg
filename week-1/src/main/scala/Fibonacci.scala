object Fibonacci extends App {

  def fib(n: Int): Int = {
    if (n == 0) {
      0
    } else if (n == 1) {
      1
    } else {
      fib(n - 1) + fib(n - 2)
    }
  }

  println("Fibonacci sequence:")

  for (n <- 0 to 10) {
    println(fib(n))
  }

}
