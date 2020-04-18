object P3ValueClasses {

  case class UserName(str: String) extends AnyVal

  case class Password(str: String) extends AnyVal

  def verify(userName: UserName, password: Password): Boolean = ???

  val user = UserName("user")
  val pwd = Password("pwd1")
  verify(user, pwd)

    verify(pwd, user) // fail
//
  implicit class RichString(val str: String) extends AnyVal {
    def doSth: String = str
  }

  "lalala".doSth // In compilation time this will be rewritten to RichString$.doSth$extension("lalala")
}

object P3ValueClassesProblems {

  import P3ValueClasses._

  user match { // this call makes Username to be instanciated
    case UserName("user") =>
    case UserName(x) =>
  }

  // Arrays needs to carry the type, not just the values
  val arrayOfUser: Array[UserName] = Array[UserName](user)

//  trait Currency
//
//  case class Money(value: Double) extends AnyVal with Currency
//
//  def whatMoney(money: Currency): Boolean = ???
//
//  val myMoney = Money(12d) // so far this is just the double !
//
//  whatMoney(myMoney) // here we need the instantiation
}
