package org.athenian.lambdas

fun main() {
  //sampleStart

  fun String.flipCase() =
    this.map {
      when (it) {
        in 'a'..'z' -> it.uppercase()
        in 'A'..'Z' -> it.lowercase()
        else -> it
      }
    }.joinToString("")

  println("Hello World!".flipCase())
  println("Go Owls!!".flipCase())
  //sampleEnd
}