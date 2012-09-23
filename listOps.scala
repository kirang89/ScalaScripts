var a = List(1,2,3)
var b = List(4,5,6)
var c = List("Today","is","a","great","day")

var listJoined = a :: b

println("New list after joining a and b : "    + listJoined)

println("Element at index 2 of list a : "      + a(2))

println("LIST C : " + c )

println("No of elems with length > 3 in c : "  + c.count(x => x.length > 3))

println("Elems with length > 3 in c : "        + c.filter(x => x.length > 3))

println("Is \"great\" is present in list c : " + c.exists(x => x == "great"))

println("Remove last 2 elems in c : "          + c.dropRight(2))

println("Display all elems in c : "            + c.foreach(println))

println("First elem : " + c.head + " and last elem: " + c.last + " in c")

println("Is list c empty ? : " + c.isEmpty)

println("Return a new String from c with , appended betw them : " + c.mkString(","))

println("Reverse list c: " + c.reverse)

println("Sort list c in alphabetical order of first char lowercased: " + c.sort((s,t) => s.charAt(0).toLower < t.charAt(0).toLower))