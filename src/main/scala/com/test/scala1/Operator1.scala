package com.test.scala1

object Operator1 {
  def main(args: Array[String]): Unit = {
      /*  val r :Int = 1+(2)
      println(r)
       */

//    val i :Int = 1 + (2)
    1+2

    /*

    //自增
    var i =1
    i += 1
    println(i)

     */

    var a = "10"
    var b = "20"
    var ab1 = a+"b"
    var ab2 = a+"b"
    println(ab1.equals(ab2))//就是判断内容是否相等

    println(ab1.eq(ab2))//比较内存地址

  }

}

/*
运算符：
    在scala中，没有真正的运算符，所谓运算符,其实就是一个方法（函数）名 !!!

    +- / * 都是方法名

    1.  在scala中，调用方法的点，可以省略
    2.  在给方法传递参数的时候，如果这个函数的参数只有一个参数或者没有参数，则原括号可以省略
        .和()都省略后，这个时候的方法名我们就成为运算符

  ++  --  这两个运算符被去掉

  关于比较相等:
    java:
        ==
            基本类型比较的就是值
            引用类型：比较的也是值，对象的地址值（内存地址）
        equals:
            只能用户引用类型
            比较的内容

        scala：
            == 等价与equals    反则 (!=)
            equals  等价于 ==
                自定义类型应该复写equals
                    不要忘记腹泻一下hashCode,这两个分的返回要一致
            eq  等价于java的 ==   只能用于AnyRef  反则(ne)

 */