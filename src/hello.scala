import scala.math._
import scala.collection.mutable._
import java.io.PrintWriter

import scala.io.Source

object hello extends App {
 var log10func=log10 _

 def divide(num1:Int, num2:Int) =try {
  (num1/num2)
 } catch {
  case ex: java.lang.ArithmeticException=>"can't divide by zero"
 } finally {}

 var result=divide(10,0)
 println(result.getClass().getSimpleName)
}

