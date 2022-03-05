package io.github.plus.e2g

import java.awt.event.ActionListener
import javax.swing.JButton
import javax.swing.JTextField

class EasyComp {
    fun EButton(text: String, x: Int, y: Int, width: Int, height: Int, actionL: ActionListener): JButton {
        val b: JButton = JButton(text)
        b.setBounds(x, y, width, height)
        b.addActionListener(actionL)
        return b
    }
    fun ETextField(text: String, x: Int, y: Int, width: Int, height: Int): JTextField {
        val t: JTextField = JTextField(text)
        t.setBounds(x, y, width, height)
        return t
    }
}