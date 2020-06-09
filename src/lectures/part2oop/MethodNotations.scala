package lectures.part2oop
import scala.language.postfixOps
object MethodNotations extends App {
  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, what the heck?!"
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)
    def isAlive: Boolean = true
    def apply(): String = s"hi, my name is $name and I like $favoriteMovie"
    def apply(n: Int) : String = s"$name watched $favoriteMovie $n times"

    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "Scala"

  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent
  // infix notation = operator notation (syntactic sugar)

  // "operators" in Scala
  val tom = new Person("tom", "Fight club")
  println(mary hangOutWith tom )

  // prefix notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with - + ~ !
  println(!mary)
  println(mary.unary_!)

  // postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  // apply
  println(mary.apply())
  println(mary())

  /*

  1. Overload the + operator
      mary + "the rockstar" => new person "Mary (the rockstar)"

  2. add an age to the person class
     add a unary + operator => new person with the age + 1
     +mary => mary with the age incrementer
  3. add a "learns" method in the Person class => "Mary learns Scala"
     add a learnsScala method, calls learns method with "scala".
     Use it in postfix notation

  4. Overload the apply method
     mary.apply(2) => "Mary watched inception 2 times"
   */

  println((mary + "the rockstart")())
  println((+mary).age)
  println(mary learnsScala)
  println(mary(10))

}
