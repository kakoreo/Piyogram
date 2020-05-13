package com.example.piyogram.Services

import com.example.piyogram.Model.topContentData

class TopContentService {

    fun getTopContent() : ArrayList<topContentData>{
        return arrayListOf(
            topContentData("icon1", "unchi", "bird1"),
            topContentData("icon2", "jeremy", "bird2"),
            topContentData("icon3", "kako", "bird3")
        )

    }

}