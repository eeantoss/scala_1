package com.test.scala1

object String_1 {
  def main(args: Array[String]): Unit = {

     val a = 20
    printf("格式化输出%d",a)
    println("----")

    val s = "我是字符串"
    printf("格式化输出字符串：%s",s)
    println("----")

    printf("浮点数:\n:%f",math.Pi)

    printf("浮点数:\n%.2f",math.Pi,"\n")

    val c = 10
    val d = 20

    println("----")
//    val s1 = " c = " + c + ", d = " + d
    // s插值法
//    val s1 = s"c = $c,b = $d" // c = 10,d=20
//    val s1 = s"c = ${c*3},b = $d"// c = 30,b = 20
      // raw插值
    val s1 =raw"\n \t"
    println(s1)


  }

}
/*
1、java的输出
  System.out.println("")
2、scala的输出
  println("")
3、printf
  格式化输出
    %d 输出整数
    %s 输出字符串
    %f 输出浮点数
4、字符串插值

 */