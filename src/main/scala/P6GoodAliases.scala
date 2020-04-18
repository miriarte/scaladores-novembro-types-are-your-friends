import scala.concurrent.CanAwait
import scala.concurrent.duration.Duration
object P6GoodAliases {
  type MyOwnMap[A] = Map[Int,A]
  type InternalizingTypes[+T] = scala.concurrent.Awaitable[T]

  val myInternalType = new P6GoodAliases.InternalizingTypes[Unit]() {
    override def ready(atMost: Duration)(implicit permit: CanAwait): this.type = ???

    override def result(atMost: Duration)(implicit permit: CanAwait): Unit = ???
  }

}

