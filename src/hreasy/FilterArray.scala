package hreasy

object FilterArray extends App {
  def f(delim:Int,arr:List[Int]):List[Int] = for {
    elem <- arr if elem < delim
  } yield elem

  def f2(delim:Int,arr:List[Int]):List[Int] = {
    arr.filter(e => e < delim)
  }

  def f3(delim:Int,arr:List[Int]):List[Int] = {
    arr.filter(_ < delim)
  }
  val testList = List(1,2,3,4,4,4,4,5,5,5)
  println(f(4,testList))
  println(f2(4,testList))

}

