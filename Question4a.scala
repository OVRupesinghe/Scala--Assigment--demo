package Assignment
import scala.io.StdIn.readInt;

object Question4a extends App{
  def wage(hours:Int):Int = hours*250 ;
  def OT(hours:Int):Int = hours*75;
  def income(h1:Int, h2:Int):Int = wage(h1)+OT(h2);
  def tax(income:Int)= income*(0.12); 
  def takeHomeSalary(h1:Int,h2:Int):Double = income(h1,h2) - tax(income(h1,h2));
  println("Enter the normal hours: ");
  var a = readInt();
  println("Enter the OT hours: ");
  var b = readInt();
  println("Your salary is: Rs."+ takeHomeSalary(a,b));
  
}
