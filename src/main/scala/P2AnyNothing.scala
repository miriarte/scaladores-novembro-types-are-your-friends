
object P2AnyNothing {
  val typeInt: Int = 3
  val typeStr: String = "meu"
  val typeLong: Long = 10L

  val `ahn?`: Nothing = throw new Exception("!")

  val typeQual: Any = if (true) typeInt else typeStr
  val typeQual2: Long = if (true) typeInt else typeLong

  val typeQual3: Int = if (true) typeInt else `ahn?`
}
