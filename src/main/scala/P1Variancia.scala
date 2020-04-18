import scala.collection.immutable.List

object P1Variancia {

  // final class Array[T]
  val arrayInt: Array[Int] = Array(1, 2, 3)
//  val arrayErrada: Array[Any] = arrayInt
//  val arrayErrada2: Array[Double] = arrayInt

  // sealed abstract class List[+A]
  val listInt: List[Int] = List[Int](1)
  val listaCompound: List[AnyVal] = 10L :: listInt


  trait Base
  trait Ext extends Base
  trait Ext2 extends Ext

  //trait Function1[ -T1,  +R] extends AnyRef
  val f = new Function1[Ext, String] {
    override def apply(v1: Ext): String = v1.toString
  }
  val a : String = f(new Ext{})
  val b : String = f(new Ext2{})
//  f(new Base{})
}
