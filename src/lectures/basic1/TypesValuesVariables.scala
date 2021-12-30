package lectures.basic1


object TypesValuesVariables {
  def main(args: Array[String]): Unit = {
    val helloString: String = "Hello String";
    val helloChar: Char = 'C';
    val helloInt: Int = 11;
    val helloLong: Long = 11;
    val helloFloat: Float = 1.1f;
    val helloDouble: Double = 1.2;
    val helloBoolean: Boolean = true;

    val (simpleInt:Int, simpleString:String) = (100500, "Test");
    println(helloString + " : " + helloString.getClass);
    println(helloChar + " : " + helloChar.getClass);
    println(helloInt + " : " + helloInt.getClass);
    println(helloLong + " : " + helloLong.getClass);
    println(helloFloat + " : " + helloFloat.getClass);
    println(helloDouble + " : " + helloDouble.getClass);
    println(helloBoolean + " : " + helloBoolean.getClass);
    println(simpleInt + " : " + simpleInt.getClass);
    println(simpleString + " : " + simpleString.getClass);

  }

}
