object P10FBounded {

  trait Wallet[T <: Wallet[T]] {
    def transfer(other: Wallet[T]): Boolean = ???
  }
  class Savings extends Wallet[Savings]
  class RiceSacks extends Wallet[RiceSacks]

  val mysavings = new Savings

  val myothersavings = new Savings
  val smallMarketStock = new RiceSacks
  mysavings.transfer(myothersavings)
//  mysavings.transfer(smallMarketStock)
}
