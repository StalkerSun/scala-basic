package lectures.basic1

object CodeBlock {
  def main (args: Array[String]) : Unit={
    val aCodeBlock={
      val someVal_1 = 1;
      val someVal_2 = 2;

      if(someVal_1+someVal_2>someVal_2-someVal_1) "plus" else "minus"

    }
    println(aCodeBlock);
  }

}
