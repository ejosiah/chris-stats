package model

case class Currency() extends Enumeration{
  type Currency = Value
}

case class Money(amount: BigDecimal, currency: Currency)

case class Product(id: String, description: String)

case class Item(product: Product, cost: Currency)