/*
 * Factorial via Tail Recursion 
 */

def factorial(n: Int): Int = {
  def loop(x: Int, n:Int): Int = {
    if(n == 0) x
    else loop(x*n, n-1)
  }
  //Calling loop using 1 as accumulator value
  loop(1,n)
}

var number = args(0)
println("The factorial of %s is %d".format(number,factorial(number.toInt)))
