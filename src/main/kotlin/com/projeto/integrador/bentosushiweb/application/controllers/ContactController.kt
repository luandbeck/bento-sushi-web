package com.projeto.integrador.bentosushiweb.application.controllers

import com.projeto.integrador.bentosushiweb.application.controllers.dtos.ContactRequestDto
import com.projeto.integrador.bentosushiweb.application.controllers.dtos.toDomain
import com.projeto.integrador.bentosushiweb.domain.services.ContactService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("contact")
class ContactController(
    private val contactService: ContactService
) {

    @PostMapping
    fun createContact(@RequestBody request: ContactRequestDto): ResponseEntity<Unit> {
        contactService.save(request.toDomain())
        return ResponseEntity.status(HttpStatus.CREATED).build()
    }
}