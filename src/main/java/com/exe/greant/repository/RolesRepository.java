package com.exe.greant.repository;

import com.exe.greant.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface RolesRepository extends JpaRepository<Role, Integer> {
}
