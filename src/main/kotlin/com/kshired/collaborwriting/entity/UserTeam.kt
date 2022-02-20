package com.kshired.collaborwriting.entity

import com.kshired.collaborwriting.entity.id.UserTeamId
import com.kshired.collaborwriting.enum.Auth
import javax.persistence.*

@Entity
@Table(name = "user_team")
@IdClass(UserTeamId::class)
data class UserTeam(
    @Id @Column(name = "user_id") var userId: String,
    @Id @Column(name = "team_id") var teamId: String,
    @Column(name = "auth") @Enumerated(EnumType.STRING) var auth: Auth
)