package io.github.itkova.eGui

import java.awt.event.ActionListener
import javax.swing.*

fun eCheckBox(text: String, x: Int, y: Int, width: Int, height: Int, selected: Boolean): JCheckBox {
    val c = JCheckBox(text)
    c.setBounds(x, y, width, height)
    c.isSelected = selected
    return c
}

fun eTextField(text: String, x: Int, y: Int, width: Int, height: Int): JTextField {
    val t = JTextField(text)
    t.setBounds(x, y, width, height)
    return t
}

fun eLabel(text: String, x: Int, y: Int, width: Int, height: Int): JLabel {
    val l = JLabel(text)
    l.setBounds(x, y, width, height)
    return l
}

fun eFrame(title: String, width: Int, height: Int): JFrame {
    val f = JFrame(title)
    f.setSize(width, height)
    f.layout = null
    f.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    return f
}