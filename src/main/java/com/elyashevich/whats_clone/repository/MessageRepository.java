package com.elyashevich.whats_clone.repository;

import com.elyashevich.whats_clone.domain.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
