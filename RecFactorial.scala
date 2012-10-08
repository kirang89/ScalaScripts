/*
 * Factorial via normal recursion
 */
def factorial(n: Int): Int = {
  if(n == 0) 1 else n * factorial(n-1)
}

var number = args(0)
println("Factorial of %s is %d".format(number, factorial(number.toInt)))
