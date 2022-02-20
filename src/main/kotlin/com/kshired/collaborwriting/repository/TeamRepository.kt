package com.kshired.collaborwriting.repository

import com.kshired.collaborwriting.entity.Team
import org.springframework.data.jpa.repository.JpaRepository

interface TeamRepository: JpaRepository<Team, String> {
}