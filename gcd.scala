
println("GCD: " + gcd(args(0).toInt,args(1).toInt))

def gcd(a:Int, b:Int): Int = {
  if(b==0) a 
  else gcd(b, a%b)
}
