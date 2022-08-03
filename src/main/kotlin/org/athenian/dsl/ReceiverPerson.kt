package org.athenian.dsl

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

  //fun person(block: Person.() -> Unit) = Person().apply { block(this) }

  //sampleStart
  fun person(block: Person.() -> Unit): Person {
    val p = Person()
    block(p)
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