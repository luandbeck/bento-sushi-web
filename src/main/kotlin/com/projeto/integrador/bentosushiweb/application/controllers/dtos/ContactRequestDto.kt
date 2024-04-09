package com.projeto.integrador.bentosushiweb.application.controllers.dtos

import com.projeto.integrador.bentosushiweb.domain.entities.Contact

data class ContactRequestDto(
    val documentNumber: String,
    val name: String,
    val email: String,
    val phoneNumber: Long,
    val message: String,
)

fun ContactRequestDto.toDomain(): Contact {
    return Contact(
        this.documentNumber,
        this.name,
        this.email,
        this.phoneNumber,
        this.message
    )
}
