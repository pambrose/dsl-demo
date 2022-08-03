package org.athenian.slides.receiver

object ReceiverPerson {

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

  //fun person(block: Person.() -> Unit) = Person().apply { block() }

  //sampleStart
  fun person(block: Person.() -> Unit): Person {
    val p = Person()
    p.block()
    return p
  }

  @JvmStatic
  fun main(args: Array<String>) {
    val p =
      person {
        name = "John"
        age = 30
      }
    println(p)
  }
//sampleEnd
}