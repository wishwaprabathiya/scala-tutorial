object Question_01 {
  def calculateAverage(temperatures: Array[Double]): Double = {
    val fahrenheitTemperatures = temperatures.map(c => (c * 9 / 5) + 32)
    val sumOfFahrenheit = fahrenheitTemperatures.reduce((a, b) => a + b)
    val averageTemperature = sumOfFahrenheit / temperatures.length
    averageTemperature
  }

  def main(args: Array[String]): Unit = {
    val inputTemperatures = Array(10.0, 20.0, 30.0)
    val averageFahrenheit = calculateAverage(inputTemperatures)
    println("Average Fahrenheit temperature: " +averageFahrenheit)
  }
}


