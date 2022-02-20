package com.kshired.collaborwriting.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "team")
class Team (name:String){
    @Id
    @Column(name = "team_id")
    val id: String = UUID.randomUUID().toString()

    @Column(name = "team_name")
    var teamName: String = name
}