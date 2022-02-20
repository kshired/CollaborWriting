package com.kshired.collaborwriting.utils

import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import io.jsonwebtoken.security.Keys
import java.nio.charset.StandardCharsets
import java.security.Key
import java.util.*

class JwtUtil {
    companion object {
        private const val SECRET_KEY = "thisIsSecret"
        fun generateAccessToken(userId: String): String {
            val header = hashMapOf<String, Any>()
            val payload = hashMapOf<String, Any>()

            header["typ"] = "JWT"
            header["alg"] = "HS256"

            payload["userId"] = userId

            val expiredTime = 1000L * 60L * 60L

            return Jwts.builder()
                .setHeader(header)
                .setClaims(payload)
                .setSubject("user-access")
                .setExpiration(Date(Date().time + expiredTime))
                .signWith(this.getKey(), SignatureAlgorithm.HS256)
                .compact()
        }

        fun generateRefreshToken(userId: String): String {
            val header = hashMapOf<String, Any>()

            header["typ"] = "JWT"
            header["alg"] = "HS256"

            val expiredTime = 1000L * 60L * 60L * 24L * 14L

            return Jwts.builder()
                .setHeader(header)
                .setSubject("user-refresh")
                .setExpiration(Date(Date().time + expiredTime))
                .signWith(this.getKey(), SignatureAlgorithm.HS256)
                .compact()
        }

        private fun getKey(): Key{
            return Keys.hmacShaKeyFor(SECRET_KEY.toByteArray(StandardCharsets.UTF_8))
        }
    }
}

