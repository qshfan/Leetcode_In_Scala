package hreasy

object SumOddElements extends App {
  def f(arr:List[Int]):Int = arr.filter(e => e % 2 != 0).sum

  def f2(arr:List[Int]): Int = arr.foldLeft(0)((b,a) => if (a % 2 != 0) (b + a) else b)
  val A = List(11,25,18,-1,26,-20,-19,23,-24,-8)
  val B = List(1,2,3,4,5)
  println(f(A))
  println(f2(A))
}
