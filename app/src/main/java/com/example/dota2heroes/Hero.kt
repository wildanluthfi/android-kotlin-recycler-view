package com.example.dota2heroes

import java.lang.reflect.Type

data class Hero(
    var name: String = "",
    var role: String = "",
    var bio: String = "",
    var image: Int = 0,
    var detail_image: Int = 0,
    var skill_image: IntArray = IntArray(0),
    var skill_name: Array<String> = arrayOf(""),
    var skill_description: Array<String> = arrayOf("")
)