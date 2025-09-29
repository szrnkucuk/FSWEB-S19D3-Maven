package com.workintech.s19d2.repository;

import com.workintech.s19d2.entity.Member;
import com.workintech.s19d2.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    @Query("Select r from Account r where m.authority=:authority")
    Optional<Role> findByAuthority(String authority);
}

