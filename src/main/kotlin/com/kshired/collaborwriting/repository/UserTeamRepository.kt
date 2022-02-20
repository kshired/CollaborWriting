package com.kshired.collaborwriting.repository

import com.kshired.collaborwriting.entity.UserTeam
import com.kshired.collaborwriting.entity.id.UserTeamId
import org.springframework.data.jpa.repository.JpaRepository

interface UserTeamRepository: JpaRepository<UserTeam, UserTeamId> {
}