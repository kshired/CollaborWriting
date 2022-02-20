package com.kshired.collaborwriting.entity

import com.kshired.collaborwriting.Enum.Auth
import com.kshired.collaborwriting.entity.id.UserTeamId
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "user_team_auth")
@IdClass(UserTeamId::class)
data class UserTeam(
    @Id @Column(name = "user_id") var userId: String,
    @Id @Column(name = "team_id") var teamId: String,
    @Column(name = "auth") @Enumerated(EnumType.STRING) var auth: Auth
)