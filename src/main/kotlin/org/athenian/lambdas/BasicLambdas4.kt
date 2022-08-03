package org.athenian.lambdas

fun main() {
  //sampleStart

  fun intCall(i: Int, func: (Int) -> Int): Int {
    return func(i)
  }

  val result1 = intCall(2) { it * it }

  val result2 = intCall(3) { it * 5 }

  println(result1)
  println(result2)
  //sampleEnd
}