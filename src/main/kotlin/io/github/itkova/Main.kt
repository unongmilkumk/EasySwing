package io.github.itkova

import io.github.itkova.board.Board
import javax.swing.JFrame


class Main: JFrame() {

    fun initUI() {
        add(Board())
        title = "Pacman"
        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(400, 400)
        setLocationRelativeTo(null)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val m = Main()
            m.initUI()
            m.isVisible = true
        }
    }
}