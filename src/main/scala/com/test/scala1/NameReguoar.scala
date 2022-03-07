package com.test.scala1

import A.a


object NameReguoar {
  def main(args: Array[String]): Unit = {

   /* val ++ =10
    println(++) */

   /* val a_++ = 20
    println(a_++)*/

    var ` ` = 30//可以使用` `作为变量名
    println(` `)

    println(a.`type`)//兼容java的
  }
}


/*
  标识符（变量，常量，类对象，方法，函数）命名规范：
  1.使用java的命名规则
    数字字母（下划线） 驼峰(大驼峰：类，小驼峰)
    scala中的下划线要慎用

  2.不要使用$
    scala编译的时候，一些类会自动添加$

  3.支持运算符( +- / * ...)来命名标识符！
    在scala中没有真正的运算符，所有的运算符其实都是对象的方法
    a: 不要使用半个运算符作为变量名和常量
    b: 字符和运算符不能混用
            a++
    c: 如果混用，要用_隔开

  4.可以使用 ` ` 定义任意的字符.主要为了兼容java中的一些标识符


 */
