package com.example.models
import kotlinx.serialization.Serializable

@Serializable
data class Customer(val id: Int, val firstName: String, val lastName: String, val email: String) {
    companion object {
        var lastId = 0
    }
    constructor(firstName: String, lastName: String, email: String) : this(lastId++, firstName, lastName, email)
}
