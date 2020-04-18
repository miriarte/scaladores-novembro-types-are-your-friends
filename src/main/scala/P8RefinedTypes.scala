import eu.timepit.refined._
import eu.timepit.refined.api.Refined
import eu.timepit.refined.auto._
import eu.timepit.refined.string.MatchesRegex
import eu.timepit.refined.types.string.NonEmptyString

object P8RefinedTypes {

  type PwdRegex = MatchesRegex[W.`"""[0-9A-Za-z]{5,10}"""`.T]
  type Pwd = String Refined PwdRegex

  def verifyRefined(username: NonEmptyString, password: Pwd): Boolean = ???

  val username: NonEmptyString = "asdfa"
  val password: Pwd = "9999"

  val newpass = "aaaaa"

  verifyRefined(username, password)

val newpassrefined: Either[String, Refined[String, PwdRegex]] = refineV[PwdRegex](newpass)
}

R
