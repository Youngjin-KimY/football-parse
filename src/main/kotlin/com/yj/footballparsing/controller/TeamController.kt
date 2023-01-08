package com.yj.footballparsing.controller

import com.yj.footballparsing.service.Team
import com.yj.footballparsing.service.TeamScoreService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/api/team")
class TeamController(val teamScoreService: TeamScoreService) {

    @GetMapping("/test")
    fun test (): List<Team> {
        return teamScoreService.parsingTeamScore()
    }
}