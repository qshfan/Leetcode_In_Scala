package hreasy

object ListLength extends App {
  def f(arr:List[Int], l: Int):Int = arr match {
    case h :: Nil => l+1
    case h :: xs  => f(xs, l+1)
  }
  val A = List(1,2,3,4)
  println(f(A, 0))

  // input only allow array -- no side effect, use function to add itself
  def f2(arr:List[Int]):Int = arr match {
    case Nil => 0
    case _ :: xs => 1 + f2(xs)
  }

  println(f2(A))

  def f3(arr:List[Int]):Int = {
    if (arr.isEmpty) 0
    else 1 + f3(arr.tail)
  }
  println(f3(A))
}
