/**
  * Created by mtumilowicz on 2019-02-05.
  */
class Const[C, A] {
  def map[B](f: A => B): Const[C, B] = this.asInstanceOf[Const[C, B]]
}
