package com.swiftcause.swiftcause

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform