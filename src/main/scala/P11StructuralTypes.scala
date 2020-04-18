import java.io.FileInputStream

object P11StructuralTypes {
  val is = new FileInputStream("")

  class MyIS {
    def close(): Unit = ???
  }

  val myIs = new MyIS()

  type Closeable = {def close(): Unit}

  def tryClose(closeable: Closeable) = closeable.close()

  List[Closeable](is, myIs).foreach(tryClose) // now it works

  List[Closeable](is, myIs).foreach {
    closeable: Closeable => closeable.close()
  }
}
