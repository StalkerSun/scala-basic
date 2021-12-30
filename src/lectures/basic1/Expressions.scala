package lectures.basic1

object Expressions {

  def main(args: Array[String]): Unit = {

    val aVal = 1 + 2 * 3;
    println(aVal);
    println(1 + 2 * 3)

    val aCondition: Boolean = true;
    val ifExpressionValue = if (aCondition) "True condition" else "False condition";
    println(ifExpressionValue);
    println(if (false) "True condition" else "False condition")

    val printer: Unit = println(if (aCondition) "True condition" else "False condition");

    //println(printer)

    var aNumber = if(('1' +: "23").toInt == 24) 24 else 123
    println(aNumber)

    //aNumber = if ("string".length == 6 & 1 < 2) & ('1' +: "23" :+ '4').toInt == 1234  24 else 123

    val someVal = print("It is just a value");
    print(someVal);




  }

}
