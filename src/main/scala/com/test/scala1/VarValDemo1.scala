package com.test.scala1

object VarValDemo1 {
  def main(args: Array[String]): Unit = {
    var a:Int = 10
    a=20
    println(a)
    println(a)
    println("----分割线----")

    val b: Int = 100
    var c =20
//    b=300
    println(b)
  }
}
/*
scala:
        //  声明变量---->var a:Int = 10
                  var 变量名 : 变量类型 = x

        //  声明常量----> val b : Int = 100
                    val 变量名 : 变量类型 = x

        //  注意:
              1.scala中能用常量的地方不要用变量
              2.不管是常量还是变量，都要定义的时候赋值
*/
