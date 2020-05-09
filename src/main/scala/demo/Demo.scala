package demo

import scala.collection.mutable.ArrayBuffer

object Demo {

  //    //5th
  //    def main(args: Array[String]): Unit = {
  //      val array = Array(1, 1, 3, 4)
  //      var result = 0
  //      var flag = false
  //      var breakFlag = false
  //      var temp = 0
  //      while (!breakFlag) {
  //        println("1.for\n2.recursive\n3.exit")
  //        val chosen = scala.io.StdIn.readInt()
  //        chosen match {
  //          case 1 =>
  //            temp = scala.io.StdIn.readInt()
  //            for (i <- array.indices) {
  //              if (array(i) == temp) {
  //                if (!flag) {
  //                  result = i
  //                }
  //                flag = true
  //              }
  //            }
  //            if (flag) {
  //              println(result)
  //            } else {
  //              println("Not found\n")
  //            }
  //          case 2 =>
  //            temp = scala.io.StdIn.readInt()
  //            result = findFirstIndex(array, temp)
  //            if (result == -1) {
  //              println("Not found\n")
  //            } else {
  //              println(result)
  //            }
  //          case 3 => breakFlag = true
  //        }
  //      }
  //    }
  //    def findFirstIndex(array: Array[Int], finding: Int): Int =
  //      inElements(array, 0, finding)
  //
  //
  //    @scala.annotation.tailrec
  //    def inElements(array: Array[Int], index: Int, finding: Int): Int = {
  //      if (index == array.length) return -1
  //      if (array(index) == finding) index
  //      else inElements(array, index + 1, finding)
  //    }

  //    //6
  //    def main(args: Array[String]): Unit = {
  //      var str = "abc    abc.abc Abc,abc 38 %"
  //      println(str)
  //      str = myFunc(str, checkAndChange)
  //      println(str)
  //    }
  //
  //    def myFunc(str: String, function: (Char, String, Int) => Char): String = {
  //      var temp = ""
  //      for (i <- 0 until str.length) {
  //        temp = temp :+ function(str.charAt(i), str, i)
  //      }
  //      temp
  //    }
  //
  //    def checkAndChange(ch: Char, str: String, index: Int): Char = {
  //      var temp = ch
  //      if(index != 0) {
  //        if (ch.isLower && str.charAt(index - 1).equals(' ')) {
  //          temp = str.charAt(index).toUpper
  //        }
  //      }
  //      temp
  //    }

  //    //7th
  //    def main(args: Array[String]): Unit = {
  //      var str = "abc Abc.abc aBc,abc"
  //      println(str)
  //      str = encrypt(str)
  //      println(str)
  //      str = decrypt(str)
  //      println(str)
  //    }
  //    def encrypt(str: String): String = {
  //      var temp = ""
  //      for(i <- 0 until str.length){
  //        var ch = str.charAt(i)
  //          var flag = false
  //          if (ch.isUpper) {
  //            flag = true
  //            ch = ch.toLower
  //          }
  //          ch = ch match {
  //            case 'a' => 'c'
  //            case 'b' => 'd'
  //            case 'c' => 'e'
  //            case 'd' => 'f'
  //            case 'e' => 'g'
  //            case 'f' => 'h'
  //            case 'g' => 'i'
  //            case 'h' => 'j'
  //            case 'i' => 'k'
  //            case 'j' => 'l'
  //            case 'k' => 'm'
  //            case 'l' => 'n'
  //            case 'm' => 'o'
  //            case 'n' => 'p'
  //            case 'o' => 'q'
  //            case 'p' => 'r'
  //            case 'q' => 's'
  //            case 'r' => 't'
  //            case 's' => 'u'
  //            case 't' => 'v'
  //            case 'u' => 'w'
  //            case 'v' => 'x'
  //            case 'w' => 'y'
  //            case 'x' => 'z'
  //            case 'y' => 'a'
  //            case 'z' => 'b'
  //            case _ => ch
  //          }
  //          if (flag) {
  //            ch = ch.toUpper
  //          }
  //          temp += ch
  //      }
  //      temp
  //    }
  //    def decrypt(str: String): String = {
  //      var temp = ""
  //      for(i <- 0 until str.length){
  //        var ch = str.charAt(i)
  //          var flag = false
  //          if (ch.isUpper) {
  //            flag = true
  //            ch = ch.toLower
  //          }
  //          ch = ch match {
  //            case 'c' => 'a'
  //            case 'd' => 'b'
  //            case 'e' => 'c'
  //            case 'f' => 'd'
  //            case 'g' => 'e'
  //            case 'h' => 'f'
  //            case 'i' => 'g'
  //            case 'j' => 'h'
  //            case 'k' => 'i'
  //            case 'l' => 'j'
  //            case 'm' => 'k'
  //            case 'n' => 'l'
  //            case 'o' => 'm'
  //            case 'p' => 'n'
  //            case 'q' => 'o'
  //            case 'r' => 'p'
  //            case 's' => 'q'
  //            case 't' => 'r'
  //            case 'u' => 's'
  //            case 'v' => 't'
  //            case 'w' => 'u'
  //            case 'x' => 'v'
  //            case 'y' => 'w'
  //            case 'z' => 'x'
  //            case 'a' => 'y'
  //            case 'b' => 'z'
  //            case _ => ch
  //          }
  //          if (flag) {
  //            ch = ch.toUpper
  //          }
  //          temp += ch
  //      }
  //      temp
  //    }

  import scala.util.control.Breaks._

  //8th
  def main(args: Array[String]): Unit = {
    var array = ArrayBuffer[String]()
    var flag = false
    while (!flag) {
      println("Please enter the option:\n1.Add word.\n2.Check word.\n0.Exit")
      val a = scala.io.StdIn.readChar()
      a match {
        case '1' => array = addWord(array)
        case '2' => checkWord(array)
        case '0' => flag = true
        case _ => println("Wrong option!")
      }
    }
  }

  def addWord(array: ArrayBuffer[String]): ArrayBuffer[String] = {
    println("Please enter the word to add.")
    val a = scala.io.StdIn.readLine()
    if (!a.isEmpty) {
      if (!array.contains(a)) {
        array += a
      }
    }
    array
  }

  def checkWord(array: ArrayBuffer[String]): Unit = {
    println("Please enter the word to check.")
    val a = scala.io.StdIn.readLine()
    var flag = false
    if (!a.isEmpty) {
      if (array.nonEmpty) {
        for (i <- array.indices) {
          val temp = array(i)
          if (temp.equals(a)) {
            flag = true
            println("Word \"" + temp + "\" has no mistakes")
          }
        }
        if (!flag) {
          println("Maybe you meant ")
          for (i <- array.indices) {
            val temp = array(i)
            var counter = 0
            breakable {
              for (i <- 0 until temp.length) {
                if (i >= temp.length || i >= a.length)
                  break
                if (temp.charAt(i).equals(a.charAt(i))) {
                  counter += 1
                }
              }
            }
            if (counter >= 2 * a.length / 3) {
              println(temp)
            }
          }
        }
      }
      else {
        println("Dictionary is empty.")
      }
    }
  }
}
