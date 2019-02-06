import org.scalatest.FunSuite

/**
  * Created by mtumilowicz on 2019-02-05.
  */
class ConstTest extends FunSuite {

  test("testMap") {
    val const1: Const[String, Int] = Const(1)
    val const2: Const[Object, Int] = Const(2)
    println(const1)
    println(const2)
    val const3: Const[String, String] = const1.map(_ => String)
  }

}
