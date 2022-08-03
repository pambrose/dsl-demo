package org.athenian.nonlambda

object Person2 {

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

  @JvmStatic
  //sampleStart

  fun main(args: Array<String>) {
    val person = Person("John Doe", 30, Address("1st St", 23, "Tulsa"))
    println(person)
  }
  //sampleEnd
}
