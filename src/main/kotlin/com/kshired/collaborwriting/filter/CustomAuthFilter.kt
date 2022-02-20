package com.kshired.collaborwriting.filter

import org.springframework.web.filter.GenericFilterBean
import javax.servlet.FilterChain
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.http.HttpServletRequest

class CustomAuthFilter : GenericFilterBean() {
    companion object {
        private const val AUTHORIZATION = "Authorization";
    }


    override fun doFilter(request: ServletRequest, response: ServletResponse, chain: FilterChain) {
        val httpServletRequest = request as HttpServletRequest
        val authorizationHeader: String? = httpServletRequest.getHeader(AUTHORIZATION)

        if(authorizationHeader.isNullOrBlank()){
            TODO("throw error")
        }

        chain.doFilter(request, response)
    }


}