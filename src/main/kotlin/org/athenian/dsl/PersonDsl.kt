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

@DslMarker
annotation class PersonDslMarker

@PersonDslMarker
inline fun person(block: Person.() -> Unit) = Person().apply { block() }

@PersonDslMarker
inline fun Person.address(block: Address.() -> Unit) {
  address = Address().apply { block() }
}

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