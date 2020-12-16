package hreasy

object ArrayOfNElem extends App {
  def f(num:Int):List[Int] = {
    val list = List.range(1, num+1)
    list
  }
  println(f(10))
}