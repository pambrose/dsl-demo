package org.athenian.slides.receiver

object ReceiverAddress {

  data class Person(
    var name: String? = null,
    var age: Int? = null,
    var address: Address? = null
  )

  data class Address(
    var street: String? = null,
    var number: Int? = null,
    var city: String? = null
  )

  //  fun person(block: Person.() -> Unit) = Person().apply { block(this) }
  //  fun Person.address(block: Address.() -> Unit) {
  //    address = Address().apply { block(this) }
  //  }

  fun person(block: Person.() -> Unit): Person {
    val p = Person()
    block(p)
    return p
  }

  //sampleStart
  fun Person.address(block: Address.() -> Unit) {
    val a = Address()
    block(a)
    address = a
  }

  @JvmStatic
  fun main(args: Array<String>) {
    val p =
      person {
        name = "John Doe"
        age = 30
        address {
          street = "1st St"
          number = 23
          city = "Tulsa"
        }
      }
    println(p)
  }
//sampleEnd
}