package com.test.scala1

object IfDemo {
  def main(args: Array[String]): Unit = {
    /*val a = 10
    if (a % 2 == 0){
      println(s"$a 是偶数")
    }else {
      println("不是偶数")
    }

     */

    val m = 10
    val n = 20

    /*

    var max = m
    if (m > n){
      max = m
    }else if {
      max = n
    }

     */

    /*
    val max = if (m > n) {
      100
      m  //如果是true的话就把m的值赋值给max
    } else n

     */
    //  上面的可以写成
    /*val max = if(m > n) m else n    //  等价于: m > n ? m :n     //  类似于java的三元运算符
    println(max)*/

    var ab = 10
    println(ab=40)

  }

}

/*

java: ? : (三元运算符)

！！重点！！！
    在scala中任意的语句（执行的语句，表达式等等）都有值！！！

流程控制：
    1.顺序流程
    2.分支
      java： 两种分支
          if 分支
              if
              if.. else if..
              if.. else if.. else
          switch 分支
              switch(要匹配的值){
                  case 常量:
                      code
                      break;
                  default:
                      break;

              }
           缺点:
              1.类型有限
                  byte short char int String（1.7增加） enum

              2.case穿透
                  忘记break，会出现

        scala ：
            if
                和java的if的使用完全一致！java怎么用，scala就怎么用！

            / /  *模式匹配：
                替换掉java的switch,语法有点像,但是远远超过java的switch / / * *


    3.循环

 */

