package com.yj.footballparsing.dto

data class TeamScoreDto(
    val name: String,
    val played: Int,
    val won: Int,
    val drawn: Int,
    val lost: Int,
    val vfor: Int,
    val against: Int,
    val gd: Int,
    val points: Int
)