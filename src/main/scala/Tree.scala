object Tree extends App {
  Array(" " * 3 + "*", " " * 2 + "*" * 3, " " * 1 + "*" * 5).foreach(item => println(s"$item"))

  println(" ")

  for (i <- 0 until 3) {
    for (j <- 0 until 3 - i) {
      print(" ")
    }
    for (z <- 0 until (i * 2 + 1)) {
      print("*")
    }
    println()
  }

  println(" ")
//Please take into account this last solution
  var maxValue = 5
      for (i <- 1 to maxValue; j = maxValue - i) {
            println(" "*j + "*"*i + "*"*(i-1))
      }


  var treeH = 3
  if (!args.isEmpty)treeH = args (0).toInt
  val result = Range(1,treeH+1).map(n => " "*(treeH-n)+ "*"*(n*2-1))
  result.foreach(println)



}





