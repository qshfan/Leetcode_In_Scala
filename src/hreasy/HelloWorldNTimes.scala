package hreasy
import scala.annotation.tailrec
// https://www.hackerrank.com/challenges/fp-hello-world-n-times/problem
// print "Hello World" N times
object HelloWorldNTimes extends App {
  @tailrec
  def f(n: Int) : Unit = {
    if (n == 0) Nil
    else {
      println("Hello World")
      f(n-1)
    }
  }
}
