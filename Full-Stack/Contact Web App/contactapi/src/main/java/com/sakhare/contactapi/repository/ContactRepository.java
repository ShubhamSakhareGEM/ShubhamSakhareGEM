package com.sakhare.contactapi.repository;

import com.sakhare.contactapi.jpa.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, String> {
    Optional<Contact> findContactById(String id);
}
