package io.github.itkova

import io.github.itkova.eGui.Player
import java.awt.event.KeyAdapter
import java.awt.event.KeyEvent

class KeyBoard : KeyAdapter() {
    private val p = Player()

    override fun keyPressed(event: KeyEvent?) {
        val e = event!!
        when(e.keyChar) {
            's' -> if (p.ps == Statue.INTRO) {p.ps = Statue.INGAME}
        }
    }
}