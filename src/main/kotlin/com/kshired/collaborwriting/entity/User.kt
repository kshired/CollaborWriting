package com.kshired.collaborwriting.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "user")
data class User(
    @Id @Column(name = "user_id") val id: String = UUID.randomUUID().toString(),
    @Column(name = "username") var username: String,
    @Column(name = "email") var email: String,
    @Column(name = "password") var password: String,
    @Column(name = "team_id") var teamId: String? = null,
    @Column(name = "is_authorized") var isAuthorized: Boolean = false,
    @Column(name = "login_fail_cnt") var loginFailCnt: Int = 0,
)