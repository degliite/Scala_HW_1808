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
  var maxValue = 3
      for (i <- 1 to maxValue; j = maxValue - i) {
            println(" "*j + "*"*i + "*"*(i-1))
      }
}



