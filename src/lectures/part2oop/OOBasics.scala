package lectures.part2oop

import java.util.Date

object OOBasics extends App {
  val author = new Writer("Matheus", "Cardoso", 1821)
  val novel = new Novel("Greate expectations", 1861, author)

  println(novel.authorAge)
  print(author.fullName)

  val counter = new Counter
  counter.inc.print
  counter.inc(10)
}

class Writer(firstName: String, surName: String,  val year: Int) {

  def fullName: String = s" my name is ${this.firstName} ${this.surName}"
}

class Novel(novelName: String, YearOfRelease: Int, author: Writer) {
  def authorAge = YearOfRelease - author.year

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYear: Int): Novel = new Novel(novelName , newYear, author)
}

class Counter(val count: Int = 0) {

  def inc = {
    println("Incrementing")
    new Counter(count + 1)
  } // immutability

  def dec = {
    println("Decrementing")
    new Counter(count -1)
  }

  def inc(n: Int): Counter = {
    if(n <= 0 ) this
    else inc.inc(n - 1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n-1)
  }

  def print = println(count)


}