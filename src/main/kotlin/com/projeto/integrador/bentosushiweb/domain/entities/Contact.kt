package com.projeto.integrador.bentosushiweb.domain.entities

data class Contact(
    val documentNumber: String,
    val name: String,
    val email: String,
    val phoneNumber: Long,
    val message: String,
)