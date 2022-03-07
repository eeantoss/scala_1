package com.test.scala1

object 类型转换 {
  def main(args: Array[String]): Unit = {
    /*val a:Long =1;
    val b : Double = a
     */

    val a = 1L
    a.toInt
    a.toByte
    val long:Long = a.toLong//用得特别多
//--------------------------
//    val s:String  = "123"
    val s:String  = "123a"
    val i :Int =Integer.parseInt(s)//java的方法
    println(i)
    println(s.toInt)
    println(s.toDouble)

  }
}


/*
值类型之间的转换
  Byte
  short
  Long
  Int
  Float
    ...
      自动转换（自动提升）
          Byte->short->int->long->float->double
                char->int
                scala中照样活用

      强制转换
          java:   (int)1L
          scala:
                .toInt
                .toDouble
                .toLong
                      ...

      字符串中，如果是纯数字，也可以转成想相应的类型:
      "123" -> 123
          java:
             Integer.parseInt(s)
          scala：
              "123".toInt
       如何转成字符串：
          123 + ""
          123.toString



引用类型的转换:
    遵守面向对象的规则，多态
 */