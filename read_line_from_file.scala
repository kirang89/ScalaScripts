import scala.io.Source;

if(args.length > 0){
  val lines = Source.fromFile(args(0)).getLines().toList
  for(line <- lines)
    println(line.length + " " + line)

  val longestLine = lines.reduceLeft(
    (a,b) => if(a.length > b.length) a else b
  )
  
  println("The longest line is: " + longestLine)
} else {
  Console.err.println("Please enter filename !")
}


