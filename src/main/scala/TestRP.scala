

//import java.io.Serializable
//import scala.language.reflectiveCalls
//
//case class Point3(x: Int, y: Int, z: Int)
//
//object TestRP extends App{
//  type Point2 = {
//    def x: Int
//    def y: Int
//  }
//
//  def transform2d[A >: Product with Serializable with Point2](v: A): A = {
//
//    val a : A = v.copy(v.x + 1,v.y-1)
//    a
//  }
//
//  val t = Point3(1,2,3)
//  val tlinha = transform2d(t)
//  println(tlinha)
//
//}
