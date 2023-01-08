package com.yj.footballparsing.service

import com.yj.footballparsing.dto.TeamScoreDto
import com.yj.footballparsing.enums.TableIndexEnum
import org.apache.logging.log4j.LogManager
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.springframework.stereotype.Service

@Service
class TeamScoreService (val teamScoreEntityService: TeamScoreEntityService){
    companion object {
        val logger = LogManager.getLogger(TeamScoreService::class.java)
    }
    fun parsingTeamScore(): List<TeamScoreDto> {
        val doc: Document = Jsoup.connect("https://bbc.com/sport/football/tables").get()
        val tables = doc.getElementsByTag("tr")
        println(tables)

        //remove no need
        tables.removeFirst()
        tables.removeLast()

        val rows = tables.map { it.children().eachText() }.toList()

        // Extract the data from each row and create a Team object for each team
        val teamDtoList = rows.map { row ->
            TeamScoreDto(
                name = row[TableIndexEnum.NAME.ordinal],
                played = row[TableIndexEnum.PLAYED.ordinal].toInt(),
                won = row[TableIndexEnum.WIN.ordinal].toInt(),
                drawn = row[TableIndexEnum.DRAWN.ordinal].toInt(),
                lost = row[TableIndexEnum.LOST.ordinal].toInt(),
                vfor = row[TableIndexEnum.GOALS.ordinal].toInt(),
                against = row[TableIndexEnum.AGAINST.ordinal].toInt(),
                gd = row[TableIndexEnum.DIFFRENCE.ordinal].toInt(),
                points = row[TableIndexEnum.POINTS.ordinal].toInt(),
            )
        }

        return teamDtoList
    }
}