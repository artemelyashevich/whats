package com.elyashevich.whats_clone.repository;

import com.elyashevich.whats_clone.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
