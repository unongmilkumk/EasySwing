package io.github.plus

import io.github.plus.e2g.EasyComp
import java.awt.event.ActionListener
import javax.swing.JButton
import javax.swing.JFrame

fun main() {
    //EasyComp 간편화
    val ec = EasyComp()

    //프레임 세팅
    val f = JFrame("버튼 예제")
    f.setSize(300, 300)
    f.layout = null
    f.isVisible = true
    f.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

    //기본적인 프레임 구성
    val tf = ec.ETextField("",50, 50, 180, 20)
    val b: JButton = EasyComp().EButton("누르지 마세요!", 80, 100, 90, 30, ActionListener(){tf.text = "Oh no"})

    //프레임 구성 집어넣기
    f.add(b)
    f.add(tf)
}