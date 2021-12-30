package lectures.basic1

object Functions {
  def main (args : Array[String]) :Unit = {

    println(stringCombiner("hello,", "world"))
    stringPrinter("hello,", " world")
  }

  def stringCombiner (str1:String, str2:String):String = {
    s"${str1.concat(str2)}";
  }
  def stringPrinter (str1:String, str2:String): Unit = {
    println(s"${str1.concat(str2)}");
  }

  def parameterlessFunction():Unit = {
    println("function without parameters")
  }

  //TODO узнать, почему осуществляется вызов функции вне блока исполнения
  //----- во про эти вызовы
  parameterlessFunction();
  parameterlessFunction;
  //-----

  def aFunctionWithDefaultParameter(x:Int, y:Int = 2):Int={
    x+y;
  }

  println(aFunctionWithDefaultParameter(3))
  println(aFunctionWithDefaultParameter(3,4))

  def callByValue(x:Long):Unit={
    println(s"call by value: x1=$x");
    println(s"call by value: x2=$x");
  }

  def callByName(x: => Long):Unit={
    println(s"call by value: x1=$x");
    println(s"call by value: x2=$x");
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

//  def someFunc(): Int = 2 * someFunc() + 1
//  def callSomeFunc(x: Int, y: => Int) = println(x)
 //callSomeFunc(someFunc(), 1)


  // исправьте код
  def aCondition(): Boolean = if ( 1 < 2) true else false

  def someFunc(x: Int, y: => Int): Int = {
     x * 2
  }

  println(someFunc(3,5))


}
