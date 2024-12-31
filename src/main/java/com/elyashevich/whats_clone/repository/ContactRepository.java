package com.elyashevich.whats_clone.repository;

import com.elyashevich.whats_clone.domain.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
