package com.projeto.integrador.bentosushiweb.resources.repositories

import com.projeto.integrador.bentosushiweb.domain.entities.Contact
import com.projeto.integrador.bentosushiweb.domain.repositories.ContactRepository
import org.springframework.jdbc.core.simple.JdbcClient
import org.springframework.stereotype.Repository


@Repository
class ContactRepositoryImpl(
    private val jdbcClient: JdbcClient
): ContactRepository {

    override fun save(contact: Contact) {
        jdbcClient.sql("""
            INSERT INTO contact (document_number, name, email, phone_number, message) 
            VALUES (:document_number, :name, :email, :phone_number, :message)
        """)
            .param("document_number", contact.documentNumber)
            .param("name", contact.name)
            .param("email", contact.email)
            .param("phone_number", contact.phoneNumber)
            .param("message", contact.message)
            .update()
    }
}