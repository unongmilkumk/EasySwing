package io.github.itkova.eGui

import java.awt.Color
import java.awt.Font
import java.awt.FontMetrics
import java.awt.Graphics2D


class Screens {
    fun showIntroScreen(g2d: Graphics2D, width: Int, height: Int, metrics: FontMetrics) {
        g2d.color = Color(0, 32, 48)
        g2d.fillRect(50, height / 2 - 30, width - 100, 50)
        g2d.color = Color.white
        g2d.drawRect(50, height / 2 - 30, width - 100, 50)
        val s = "Press s to start."
        val small = Font("Helvetica", Font.BOLD, 14)
        g2d.color = Color.white
        g2d.font = small
        g2d.drawString(s, (width - metrics.stringWidth(s)) / 2, height / 2)
    }
}