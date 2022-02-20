package com.kshired.collaborwriting.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "post")
data class Post(
    @Id @Column(name = "post_id") val id: String = UUID.randomUUID().toString(),
    @Column(name = "user_id") var userId: String,
    @Column(name = "team_id") var teamId: String,
    @Column(name = "content") var content: String
)