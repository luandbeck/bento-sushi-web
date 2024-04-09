package com.projeto.integrador.bentosushiweb.domain.services

import com.projeto.integrador.bentosushiweb.domain.entities.Contact
import com.projeto.integrador.bentosushiweb.domain.repositories.ContactRepository
import org.springframework.stereotype.Service

@Service
class ContactService(
    private val repository: ContactRepository
) {

    fun save(contact: Contact) {
        repository.save(contact)
    }
}