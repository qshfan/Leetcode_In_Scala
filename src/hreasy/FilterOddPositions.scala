package hreasy

object FilterOddPositions extends App {
  def f(arr: List[Int]): List[Int] = {
    for {
      (elem, i) <- arr.zipWithIndex if i % 2 == 1
    } yield elem
  }

  def f2(arr: List[Int]): List[Int] = {
    arr.zipWithIndex collect{
      case (elem, i) if i % 2 == 1 => elem
    }
  }

  def f3(arr: List[Int]): List[Int] = arr.zipWithIndex filter { v => (v._2 + 1) % 2 == 0 } map { _._1 }

  def f4(arr: List[Int]): List[Int] = arr match {
    case x :: y :: xs => y :: f4(xs)
    case _ => Nil
  }

  val A = List(1,2,3,4,5,6,7,8)
  println(f(A))
  println(f2(A))
  println(f3(A))
  println(f4(A))
}
