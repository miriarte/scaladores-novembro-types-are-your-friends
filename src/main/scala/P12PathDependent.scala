object P12PathDependent {

  class Wallet(name: String) {
    case class Asset(nome: String)
    def transfer(giver: Asset, receiver: Asset): Boolean = ???
  }

  val derivatives = new Wallet("derivatives")
  val assetDerivative1 = derivatives.Asset("1")
  val assetDerivative2 = derivatives.Asset("2")
  val tesouro = new Wallet("LTN")

  derivatives.transfer(assetDerivative1, assetDerivative2) // this works
//  tesouro.transfer(assetDerivative1, assetDerivative2) // this wont work

}
