package com.elyashevich.whats_clone.repository;

import com.elyashevich.whats_clone.domain.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
