package com.kshired.collaborwriting.repository

import com.kshired.collaborwriting.entity.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository: JpaRepository<Post, String>{
}