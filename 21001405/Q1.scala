package lab

import scala.io.StdIn

object Question_01 {
  val alphabet = 26

  
  def encryption(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shift) % alphabet + base).toChar
      }
      else
        char
    }
  }


  def decryption(text: String, shift: Int): String = {
    encryption(text, alphabet - shift)
  }

  def ciper(text:String,shift:Int,func:(String,Int)=>String):String={
    func(text,shift)
  }

  def main(args:Array[String]): Unit = {
    print("Enter the text: ")
    val txt = StdIn.readLine()
    print("Shift by: ");
    val shift = StdIn.readInt()

    
    val encryptedTxt = ciper(txt,shift,encryption)
    println("Encrypted text: " + encryptedTxt)

    
    println("Decrypted text: " + ciper(encryptedTxt,shift,decryption))
}
}