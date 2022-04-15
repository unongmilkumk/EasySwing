package io.github.itkova.eGui

import io.github.itkova.Statue
import java.awt.Image
import javax.swing.ImageIcon

class Player {
    //좌표 선언
    var px = 200
    var py = 200

    //상태
    var ps = Statue.INTRO

    //이미지 불러오기
    fun getPlayerImage(): Image {
        return ImageIcon("Player.png").image!!
    }
}