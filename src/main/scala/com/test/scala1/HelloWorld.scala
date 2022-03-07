package com.test.scala1

//object可以理解成对象
object HelloWorld {
  def main(args: Array[String]): Unit = {
    System.out.println("hello,world")
    print("hello,world")
  }
}
/*
执行代码:
  java：定义类，然后在类中定义一个静态的main方法
  scala： 没有静态的概念  创建对象，在对象中定义main方法
 */
