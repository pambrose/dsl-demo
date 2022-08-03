package org.athenian.lambdas

fun main() {
  //sampleStart

  val strLength: String.() -> Int = { this.length }

  val doubleStr: String.() -> String = { "$this-$this" }

  val nStr: String.(Int) -> String = { List(it) { this }.joinToString("-") }

  println(strLength("Hello"))
  println(doubleStr("World"))
  println(nStr("Summer", 6))
  //sampleEnd
}