package com.test.scala1

object ifDemo2 {
  def main(args: Array[String]): Unit = {
    /*  val m = 10
    val n = 20

    val max =   if (m>n) m else n //java的三元运算符

    println(max)
     */

    var a= 10
    println(a =  40) //在scala中，赋值的语句的值是Unit (+= -= ...)

    // 计算一个数的平凡跟
    val m = -99.9
//    val s = Math.sqrt(m)
    val s = if (m<0){
//      println("输入不正确")
      throw new IllegalArgumentException("你的输入不正确")// 返回的类型Nothing
    }else{

      Math.sqrt(m)

    }

    println(s)

  }
}
/*

 */