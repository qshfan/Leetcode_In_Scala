package hreasy

object ListReplication extends App {
  def f(num: Int, arr: List[Int]) : List[Int] = {
    arr.flatMap(x => List.fill(num)(x))
  }
}
