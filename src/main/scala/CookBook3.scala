import java.io.FileWriter

object CookBook3 extends App {
  val srcName = "c:/poems/ebook.txt"
  val destName = "c:/poems/ebook-result3.txt"

  def openSource(fName: String) = {
    val filePointer = scala.io.Source.fromFile(srcName)
    val myLines = filePointer.getLines.toSeq
    filePointer.close()
    myLines
  }

//result contains some recipe names which ingredient list had a different type.
  def processSeq(mySeq: Seq[String]): Seq[String] = {
    val recipe: Seq[String] = mySeq.filter(r => r == r.toUpperCase || r.startsWith("    "))
    val noEmptyrows = recipe.filter(row => row!= null && row.length>0)
    noEmptyrows.slice(45,607) //not the best solution how to get rid of unnecessary lines.

  }

def saveSeq(destName:String, mySeq: Seq[String]) = {
  val newFile = new FileWriter(destName)
  newFile.write("Extracted Recipe Names with Ingredients: \r\n\r\n")
  mySeq.map(_ + "\r\n").foreach(newFile.write) // adding new line to each line before writing
  println(s"Filtered Cookbook saved to file $destName")
  newFile.close()
}

  val mySeq = openSource(srcName)
  val filteredSeq = processSeq(mySeq)
  saveSeq(destName,filteredSeq)
}

