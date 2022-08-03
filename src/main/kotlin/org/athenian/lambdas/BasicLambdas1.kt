package org.athenian.lambdas

fun main() {
  //sampleStart

  val return8: () -> Int = { 8 }

  val doubleIt: (Int) -> Int = { value: Int -> value * 2 }

  val tripleIt: (Int) -> Int = { it * 3 }

  println(return8.invoke())
  println(doubleIt(5))
  println(tripleIt(6))
  //sampleEnd
}