package services

import akka.actor.Actor
import model.Item
import scala.collection._

object User{
  case class Add(item: Item)
  case object Checkout
}

class User extends Actor{

  val basket = mutable.Map()

  def receive = {
    case _ => // TO
  }
}
