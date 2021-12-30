package lectures.basic1


object StringOperations {

  def main (args: Array[String]): Unit={
    val aString:String = "Scala_course";


    println(aString.charAt(11));
    println(aString.substring(11,12));
    println(aString.take(12));

    println(aString.substring(0,5).toUpperCase);
    println(aString.toUpperCase.substring(0,5));
    println(aString.take(5).toUpperCase);

    println(aString.replace("a", "").take(3).reverse)


    val intAString:Int = "24".toInt;

    println('1'+:"42":+'3');
    println('1'+:"42":++"3");
    println(1.toString++"42":++"3");

    val aStr:String = (42.toString).+:('1');
    println(aStr:+('3'));

    var aStr1:String = '1'+:"2":++"3"
    //aStr1 = "12".appendedAll("3")


    var aStr2:String = "1"++:"2"++:"3"; //123
    aStr2 = "12"++:"3"; //123
    aStr2 = "12".prependedAll("3"); //312

    //aStr2 = "12".prependedAll("3")
    println(aStr1);
    println(aStr2);

    println('3'+:"4")

    val name:String = "John";
    println(s"Hello, $name")

    val nameTwo:String = "Test";
    println(s"Hello, ${name+" and "+nameTwo}");

    val str:String= "test string \n with new line";
    println(str)
    println(s"$str")
    println(raw"test string \n with new line")
    println("test string \n with new line")
    println(raw"$str")

    val link = "https://stepik.org"

    println(s"The link is $link.toUpperCase") // "The link is https://stepik.org.toUpperCase"
    println(s"The link is link") //"The link is link"
    println(s"The link is ${link.toUpperCase}") // The link is HTTPS://STEPIK.ORG
    //println(s"The link is $linc")//not found: value
    println(raw"The link is \t $link") //The link is \t https://stepik.org
    //println(link :+ '/catalog') //unclosed character literal
    println(s"The link is \t $link") //The link is   https://stepik.org

    println(link :++ "/catalog") //https://stepik.org/catalog






  }


}
