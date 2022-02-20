package com.kshired.collaborwriting.repository

import com.kshired.collaborwriting.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, String> {
}