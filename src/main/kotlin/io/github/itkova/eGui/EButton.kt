package io.github.itkova.eGui

import java.awt.event.ActionListener
import javax.swing.ImageIcon
import javax.swing.JButton

fun eButton(text: String, x: Int, y: Int, width: Int, height: Int, actionL: ActionListener): JButton {
    val b = JButton(text)
    b.setBounds(x, y, width, height)
    b.addActionListener(actionL)
    return b
}

fun eButton(x: Int, y: Int, width: Int, height: Int, actionL: ActionListener): JButton {
    val b = JButton()
    b.setBounds(x, y, width, height)
    b.addActionListener(actionL)
    return b
}

fun eButton(img: ImageIcon, x: Int, y: Int, width: Int, height: Int, actionL: ActionListener): JButton {
    val b = JButton(img)
    b.setBounds(x, y, width, height)
    b.addActionListener(actionL)
    return b
}

