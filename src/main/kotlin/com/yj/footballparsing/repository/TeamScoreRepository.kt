package com.yj.footballparsing.repository

import com.yj.footballparsing.entity.TeamScoreEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TeamScoreRepository: JpaRepository<TeamScoreEntity, Long>{
}