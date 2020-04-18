import io.estatico.newtype.macros.newtype

object P7Newtype {
 @newtype case class MyType(str:String)

  /*
  This will be compiled to something like

  object MyType {
    type Repr = String
    type Base = Any { type MyType$newtype }
    trait Tag extends Any
    type Type <: Base with Tag

    def apply(x: String): MyType = x.asInstanceOf[MyType]

    implicit final class Ops$newtype(val $this$: Type) extends AnyVal {
      def toString: String = $this$.asInstanceOf[String]
    }
  }

   */

  val mijnType = MyType("string")
}
