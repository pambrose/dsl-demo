package org.athenian.lambdas

fun main() {
  //sampleStart

  val returnHi: () -> String = { "Hello" }

  val doubleIt: (String) -> String = { value: String -> value + value }

  val upperIt: (String) -> String = { it.uppercase() }

  println(returnHi())
  println(doubleIt("Hi"))
  println(upperIt("World!"))
  //sampleEnd
}