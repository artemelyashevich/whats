package com.elyashevich.whats_clone.repository;

import com.elyashevich.whats_clone.domain.entity.GroupMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupMemberRepository extends JpaRepository<GroupMember, Long> {
}
