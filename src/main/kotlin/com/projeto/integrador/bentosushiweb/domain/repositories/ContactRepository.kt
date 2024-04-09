package com.projeto.integrador.bentosushiweb.domain.repositories

import com.projeto.integrador.bentosushiweb.domain.entities.Contact

interface ContactRepository {

    fun save(contact: Contact)
}