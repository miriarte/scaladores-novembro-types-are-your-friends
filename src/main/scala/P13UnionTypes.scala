import java.net.{HttpURLConnection, URL}

object P13UnionTypes {

  type ¬[A] = A => Nothing
  type ¬¬[A] = ¬[¬[A]]
  type ∨[T, U] = ¬[¬[T] with ¬[U]]
  type |∨|[T, U] = {type λ[X] = ¬¬[X] <:< (T ∨ U)}

  type ConnectionANDString = HttpURLConnection with String //this exists

  type ConnectionORInt = HttpURLConnection |∨| Int // now it exists!

  def process[T: ConnectionORInt#λ](connOrInt: T) = connOrInt match {
    case a : HttpURLConnection => // yey!
    case Int => // yey again
  }

  process(1)
  process(HttpURLConnection.HTTP_BAD_REQUEST)
  //  process("") // nao compila

}
