object Question_02 {
  def countLetterOccurrences(words: Array[String]): Int = {
    val letterCounts = words.map(words=> words.length) 
    val totalLetterCount = letterCounts.reduce((a, b)=> a+ b)
    totalLetterCount
  }

  def main(args: Array[String]): Unit = {
    val inputWords = Array("apple", "banana", "cherry", "date")

    val totalCount = countLetterOccurrences(inputWords)
    println("Total count of letter occurrences:" +totalCount)
  }
}
