package com.yj.footballparsing.entity

import jakarta.persistence.*

@Entity
@Table(name = "Team_score")
data class TeamScoreEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(name = "team_id", nullable = false)
    val teamId: Long,

    @Column(name = "played", nullable = false)
    val played: Int,

    @Column(name = "won", nullable = false)
    val won: Int,

    @Column(name = "drawn", nullable = false)
    val drawn: Int,

    @Column(name = "lost", nullable = false)
    val lost: Int,

    @Column(name = "for", nullable = false)
    val vfor: Int,

    @Column(name = "against", nullable = false)
    val against: Int,

    @Column(name = "gd", nullable = false)
    val gd: Int,

    @Column(name = "points", nullable = false)
    val points: Int
)