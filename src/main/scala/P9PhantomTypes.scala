import java.io.{FileInputStream, InputStream}

import P9PhantomTypes.DBConn

object P9PhantomTypes {

  sealed trait InputStreamState

  sealed trait Open extends InputStreamState

  sealed trait Closed extends InputStreamState

  object MyInputStream {
    def create(is: InputStream) = new MyInputStream[Open](is)
  }

  class MyInputStream[State <: InputStreamState] private(is: InputStream) extends InputStream {
    override def read(): Int = ???

    def safeClose(implicit ev: State =:= Open): MyInputStream[Closed] = {
      is.close()
      new MyInputStream[Closed](null)
    }
  }

  val meuIs = MyInputStream.create(new FileInputStream(""))
  meuIs.safeClose.s


  class DBConn private(name: String, conn: String)

  object DBConn {

    sealed trait DBConnState

    sealed trait WithNothing extends DBConnState

    sealed trait WithName extends DBConnState

    sealed trait WithConnection extends DBConnState

    type MinimumReq =  WithNothing with WithName with WithConnection


    object Builder {
      def apply(): Builder[WithNothing] = Builder[WithNothing](null, null)
    }

    case class Builder[State <: DBConnState](name: String, conn: String) {

      def addName(string: String): Builder[State with WithName] = this.copy(name = string)

      def addConnection(string: String): Builder[State with WithConnection] = this.copy(conn = string)

      def addPort(string: String): Builder[State] = this

      def build(implicit ev: State =:= MinimumReq): DBConn =
        new DBConn(this.name, this.conn)
    }

  }


  val db: DBConn = {
    DBConn.Builder().addPort("")
      .addConnection("").addName("").addName("").addName("").addName("").addName("").build
    ???
  }
}

