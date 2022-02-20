package com.kshired.collaborwriting.entity

import com.kshired.collaborwriting.Enum.Auth
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "user_team_auth")
class UserTeamAuth(userId:String, teamId:String, auth: Auth) {
    @Id
    @Column(name = "user_team_auth_id")
    val id: String = UUID.randomUUID().toString()

    @Column(name = "user_id")
    var userId: String = userId

    @Column(name = "team_id")
    var teamId: String = teamId

    @Column(name = "auth")
    @Enumerated(EnumType.STRING)
    var auth: Auth = auth
}