package com.test.scala1

import java.io.InputStreamReader
import java.util.Scanner
import scala.io.StdIn

object Input {
  def main(args: Array[String]): Unit = {
 /*   val scanner = new Scanner(System.in)
    println(scanner.nextLine()) */

    /*   //把标准的输入流转成字符流
    val reader=new Buff (new InputStreamReader(System.in))*/

//    println("请输入你的账号")
    val line : String =StdIn.readLine("请输入你的账号")
    println(line)

  }

}

/*

从键盘输入数据
  java
    1.高级写法
      val scanner = new Scanner(System.in)
      println(scanner.nextLine())

    2.

  scala:
  val line : String =StdIn.readLine("请输入你的账号")
    println(line)

 */