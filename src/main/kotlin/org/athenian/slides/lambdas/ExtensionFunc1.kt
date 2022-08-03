package org.athenian.lambdas

fun main() {
  //sampleStart

  fun String.firstLast(): String {
    return "${this.first()}${this.last()}"
  }

  fun String.missingFirstLast() = this.substring(1, this.length - 1)

  println("Hello World!".firstLast())
  println("Hello World!".missingFirstLast())
  //sampleEnd
}