package pocketCalculator

object PocketCalculator

class PocketCalculator {
  def add(x: Int, y: Int): Int =
    val result = x + y
    if (x > 0 && y > 0 && result < 0) throw new OverflowException()
    else result
  def subtract(x: Int, y: Int): Int =
    if (x + y < Int.MinValue) throw new UnderflowException()
    else x - y
  def multiply(x: Int, y: Int): Int = { 0 }
  def divide(x: Int, y: Int): Int =
    if (y == 0) throw new MathCalculationException("Cannot divide by 0")
    else x / y
}

class OverflowException extends RuntimeException
class UnderflowException extends RuntimeException
class MathCalculationException(message: String) extends RuntimeException {}
