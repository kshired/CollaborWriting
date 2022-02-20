package com.kshired.collaborwriting.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "post")
class Post(userId: String, teamId: String, content: String) {
    @Id
    @Column(name = "post_id")
    val id: String = UUID.randomUUID().toString()

    @Column(name = "user_id")
    var userId: String = userId

    @Column(name = "team_id")
    var teamId: String = teamId

    @Column(name = "content")
    var content: String = content
}