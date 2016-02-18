package parser

object main { 
  def main(args:Array[String]):Unit=
  {
    val input = readLine("give a input ")
    val parser = new ToInt().parseToInt(input)
    val parserShort = new ToInt().parseToIntFunctional(input)
    println("parseToInt : "+parser+" || parseToIntFunctional : "+parserShort)
  }
}
