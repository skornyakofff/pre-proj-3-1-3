package ru.skornyakov.spring.boot_security.preproj313.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skornyakov.spring.boot_security.preproj313.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
