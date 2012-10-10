/*
 *Sum of range x...y using Tail Recursion
 */

def sum(f: Int => Int, a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if(a > b) acc
    else loop(a + 1, f(a) + acc)
  }
  loop(a,0)
}

var val1 = args(0).toInt
var val2 = args(1).toInt

println("The sum of range %d to %d is: %d".format(val1, val2, sum(x => x, val1, val2)))
