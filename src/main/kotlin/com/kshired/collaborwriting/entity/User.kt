package com.kshired.collaborwriting.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "user")
class User(username: String, email: String, password: String) {
    @Id
    @Column(name = "user_id")
    val id: String = UUID.randomUUID().toString()

    @Column(name = "username")
    var username: String = username

    @Column(name = "email")
    var email: String = email

    @Column(name = "password")
    var password: String = password

    @Column(name = "team_id")
    var teamId: String? = null

    @Column(name = "is_authorized")
    var isAuthorized: Boolean = false

    @Column(name = "login_fail_cnt")
    var loginFailCnt: Int = 0
}