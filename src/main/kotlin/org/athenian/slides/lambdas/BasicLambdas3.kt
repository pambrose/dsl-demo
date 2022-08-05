package org.athenian.lambdas

fun main() {
  //sampleStart

  val strLength: String.() -> Int = { this.length }

  val doubleStr: String.() -> String = { "$this-$this" }

  val nStr: String.(Int) -> String = { List(it) { this }.joinToString("-") }

  println("Hello".strLength())
  println(strLength("Hello"))
  println("World".doubleStr())
  println(doubleStr("World"))
  println("Winter".nStr(4))
  println(nStr("Summer", 6))
  //sampleEnd
}