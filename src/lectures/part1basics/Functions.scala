package lectures.part1basics

object Functions extends App{

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("Hello", 4))

  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n==1) aString
    else aString + aRepeatedFunction(aString,n-1)
  }

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n,n-1)
  }

  def greetingFunction(name: String, age: Int): String = s"Hello My name is $name and I'm $age years old"
  println(greetingFunction("matheus",23))

  def factorialFunction(n: Int): BigInt  = {
    if (n == 0) 1
    else factorialFunction(n - 1) * n
  }
  println(factorialFunction(10))

  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }
  println(fibonacci(10))

  def isPrime1(n: Int): Boolean = ! ((2 until n-1) exists (n % _ == 0))
}

