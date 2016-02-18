package parser

class ToInt {
  def parseToInt(valueUser:String):Int=
  {
    val value = valueUser
    var counter, temp = 0
    while (counter < value.length) 
    {
      temp = 10*temp + (value(counter) - '0')
      counter += 1 
    }
    return temp
  }
  
  def parseToIntFunctional(valueUser:String):Int=
  {
    return valueUser.foldLeft(0)((a,b) => a*10 + (b - '0'))
  } 
}