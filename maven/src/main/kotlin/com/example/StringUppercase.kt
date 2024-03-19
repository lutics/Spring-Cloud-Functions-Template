package com.example

import org.springframework.stereotype.Component
import java.util.function.Function

@Component
class StringUppercase() : Function<String, String> {
    override fun apply(previousString: String): String {
        return previousString.toUpperCase()
    }
}