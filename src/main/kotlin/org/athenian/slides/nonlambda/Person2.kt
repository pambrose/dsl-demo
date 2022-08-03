package org.athenian.slides.nonlambda

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
    val person = Person(
      name = "John Doe",
      age = 30,
      address = Address(
        street = "1st St",
        number = 23,
        city = "Tulsa"
      )
    )
    println(person)
  }

//sampleEnd
}
