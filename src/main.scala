class Parser
{
  def filter(valueUser:String):Int=
  {
    val value = valueUser
    var i, s = 0
    while (i < value.length) 
    {
      s = 10*s + (value(i) - '0'); 
      i += 1 
    }
    return s
  }
  
  def ShorterWay(valueUser:String):Int=
  {
    return valueUser.foldLeft(0)((a,b) => a*10 + (b - '0'))
  } 
}

object main { 
  def main(args:Array[String]):Unit=
  {
    val input = readLine("give a input ")
    val parser = new Parser().filter(input)
    val parserShort = new Parser().ShorterWay(input)
    println("long : "+parser+" || short : "+parserShort)
  }
}
