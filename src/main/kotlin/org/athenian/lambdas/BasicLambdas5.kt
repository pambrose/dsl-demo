package org.athenian.lambdas

fun main() {
  //sampleStart

  fun strCall(s: String, func: (String) -> String): String {
    return func(s)
  }

  val result1 = strCall("Hello") { it.substring(1, 3) }

  val result2 = strCall("World!") { it.drop(3) }

  println(result1)
  println(result2)
  //sampleEnd
}