package Assignment

object Question3 extends App{
    
  var a : Int = 2;
  var b : Int = 3;
  var c : Int = 4;
  var d : Int = 5;
  var k : Float = 4.3f;
  var g : Float = 4.0f;
  
  b -= 1;
  d -= 1;
  println("--b*a+c*d-- = " + (b*a+c*d));
  a += 1 ;
  println("a++ = " + a);
  println("–2*(g–k)+c = "+((-2)*(g-k)+c));
  println("c = c++ = "+ (c+=1));
  c+=1;
  a+=1;
  println("c = ++c*a++ = " + (c*a));
}