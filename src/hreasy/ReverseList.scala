package hreasy

import scala.annotation.tailrec

object ReverseList extends App {
  def f(arr:List[Int]):List[Int] = arr.reverse

  // not tailrec
  def f2(arr:List[Int]):List[Int] = arr match {
    case Nil => arr
    case (x :: xs) =>  f2(xs) ::: List(x)
  }

  // version with tailrec
  def f3(arr:List[Int]):List[Int] = {
    @tailrec
    def rlRec(res: List[Int], arr: List[Int]) : List[Int] = {
      arr match {
        case Nil => res
        case (x::xs) => {rlRec(x :: res, xs)}
      }
    }
    rlRec(Nil, arr)
  }


  val A = List(1,2,3,4,5)
  println(f(A))
  println(f2(A))
  println(f3(A))
}

