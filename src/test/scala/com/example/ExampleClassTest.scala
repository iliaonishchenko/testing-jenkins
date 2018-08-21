package com.example

import org.scalatest.{FunSpec, Matchers}

class ExampleClassTest extends FunSpec with Matchers {

  describe("Example class ") {
    it("should concate string") {
      val exampleClass = new ExampleClass("hello", 1)
      val result: String = exampleClass.concateString("world")

      result should be("helloworld")
    }
    it("should sum strings") {
      val exampleClass = new ExampleClass("hello", 1)
      val result: Int = exampleClass.sum(10)

      result should be(11)
    }
  }
}
