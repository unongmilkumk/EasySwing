package io.github.itkova.board

import io.github.itkova.Statue
import io.github.itkova.eGui.Player
import io.github.itkova.eGui.Screens
import java.awt.*
import javax.swing.JPanel
import javax.swing.Timer


class Board : JPanel() {
    //변수
    private val p = Player()
    private val d = Dimension(width, height)

    private var timer: Timer? = null

    init {
        init()
    }

    private fun init() {
        isFocusable = true
        background = Color.BLUE
        timer = Timer(40) {
            repaint()
        }
        timer!!.start()
    }

    //화면 설정하기
    override fun paintComponent(g: Graphics?) {
        super.paintComponent(g)
        doDrawing(g)
    }

    private fun doDrawing(graphics: Graphics?) {
        var g = graphics!!
        g.drawImage(p.getPlayerImage(), p.px, p.py, this)
        if (p.ps == Statue.INTRO) {
            Screens().showIntroScreen(g as Graphics2D, width, height, getFontMetrics(Font("Helvetica", Font.BOLD, 14)))
        }
    }
}