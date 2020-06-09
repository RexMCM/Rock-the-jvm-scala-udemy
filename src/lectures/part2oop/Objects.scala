package lectures.part2oop

object Objects extends App {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")

  object Person {
    val N_EYES = 2
    def canFly: Boolean = false

    // factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(val name: String){
    // instance-level functionality
  }
  // COMPANIONS
  println(Person.N_EYES)
  println(Person.canFly)

  // scala object = Singleton instance
  val mary= new Person("Mary")
  val john = new Person("John")
  println(mary == john)

  val bobbie = Person(mary, john)
}
