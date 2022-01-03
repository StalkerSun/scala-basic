package lectures.basic1

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion {
  def main (args: Array[String]): Unit={
    //printer(10, "Test text");
    println(factorialWithTailRecursion(3));
    printerTail(10, "Test");

    repeatWord("Text", 10)
    println(powerTwo(64))

    val fArgs=Array("15","1", "1000" )
    println(stringCreator(addedValue(fArgs(0).toInt, fArgs(1).toInt, fArgs(2).toInt)))
    val res = addedValue(fArgs(0).toInt, fArgs(1).toInt, fArgs(2).toInt).toString+" "

    val count = res.length -1
    println(s"${res*count}is the result")

    val baseVal = "25 "
    val ind = 5;

    println(s"${baseVal*ind}is the result")

    println(testString("I like     Scala"))

  }

  /**
   * Так делать не надо!! в методн используется переменная var
   * @param counter сколько раз вывести текст
   * @param text текст который нужно вывести
   */
  def printer(counter:Int, text:String): Unit={
    var i=0;
    while (i<counter){
      println(text);
      i+=1;
    }
  }
  def getFactorial(number: Int): Int={
    if(number<=0) 1
    else
    number*getFactorial((number-1));
  }

  def factorialWithTailRecursion(number : Int): Int={

    @tailrec
    def loop(x:Int, accumulator: Int = 1):Int={
      if(x<=1) accumulator
      else
        loop(x-1, x*accumulator)
    }
    loop(number)
  }

  def printerTail(counter:Int, text:String):Unit={
    @tailrec
    def loop(x:Int, accumulator: String = text):String={
      if(x<=1) accumulator
      else
        loop(x-1, s"$text $accumulator");
    }
    println(loop(counter))
  }

  def repeatWord(word: String, n: Int): Unit = {
    @tailrec
    def loop(i: Int, acc: String = word): String = {
      if (i <= 1) acc
      else loop(i - 1, s"$word $acc")
    }

    println(loop(n))
  }


  def powerTwo(pow:Int):BigInt={
    @tailrec
    def loop(x:Int, acc:BigInt=2):BigInt={
      if(x<=1) acc
      else
        loop(x-1, acc*2)
    }
    loop(pow)
  }

  def addedValue(baseVal:Int, addVal:Int, counter: Int):Int={

    def loop (x:Int, acc:Int=baseVal+addVal): Int ={
      if(x<=1) acc
      else
        loop(x-1, acc+addVal)
    }
    loop(counter)
  }
  def stringCreator(valPrint: Int, finalPhrase:String="is the result"):String={
    @tailrec
    def loop(x:Int, acc:String = valPrint.toString):String={
      if(x<=1) acc
        else
        loop(x-1, s"$valPrint $acc")
    }

    val res:String = loop(valPrint.toString.length)

    s"$res $finalPhrase"
  }


  def testString (str:String):String= {
    str.trim.replaceAll(" +", " ").split(" ").reverse.mkString(" ")
  }


}
