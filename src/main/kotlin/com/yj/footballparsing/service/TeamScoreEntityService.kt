package com.yj.footballparsing.service

import com.yj.footballparsing.entity.TeamScoreEntity
import com.yj.footballparsing.repository.TeamScoreRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional

@Service
class TeamScoreEntityService (val teamScoreRepository: TeamScoreRepository) {

    @Transactional(propagation = Propagation.REQUIRED)
    fun save(teamScoreEntity: TeamScoreEntity) {
        teamScoreRepository.save(teamScoreEntity)
    }
}