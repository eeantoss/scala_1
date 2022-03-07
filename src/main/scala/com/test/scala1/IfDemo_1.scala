package com.test.scala1

object IfDemo_1 {
  def main(args: Array[String]): Unit = {
    var a = 10
    var b = 40
    /*val max = if (a>b){
      a
    }else{
      b
    }
    println(max)*/
//上面的=这里
//    val max = if (a > b ) a else b

 /*   var ab =10
    println(ab = 30)*/

  /*  val m = -99
    val s =if (m<0){
      throw new IllegalArgumentException("你的参数不对")
    }else{
      Math.sqrt(m)
    }
    println(s) */

    val m = -99.9

    val s:Double =Math.sqrt(m)

    println(s)
    //Option


  }
}
