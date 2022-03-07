package com.test.scala1

object String_2 {
  def main(args: Array[String]): Unit = {
/*
    val s =
      """
         多行字符串1
         多行字符串2
多行字符串3

         多行字符串4
        """

 */
    /*
    val  s=
      """
        |啊
        |阿萨
        |撒旦
        |阿斯顿
        |阿斯顿
        |啊啊
        |""".stripMargin

     */
    val data = "2020-03-02"
    val s =
    s"""
      |select
      |*
      |from user
      |where date="$data"
      |""".stripMargin
    println(s)
  }
}
/*
多行字符串:
 */