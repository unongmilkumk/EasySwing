package io.github.plus.e2g

import java.awt.event.ActionListener
import javax.swing.JButton
import javax.swing.JTextField

class EasyComp {
    fun eButton(text: String, x: Int, y: Int, width: Int, height: Int, actionL: ActionListener): JButton {
        val b = JButton(text)
        b.setBounds(x, y, width, height)
        b.addActionListener(actionL)
        return b
    }
    fun eTextField(text: String, x: Int, y: Int, width: Int, height: Int): JTextField {
        val t = JTextField(text)
        t.setBounds(x, y, width, height)
        return t
    }
}