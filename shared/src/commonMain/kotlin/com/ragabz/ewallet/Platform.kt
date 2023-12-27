package com.ragabz.ewallet

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform