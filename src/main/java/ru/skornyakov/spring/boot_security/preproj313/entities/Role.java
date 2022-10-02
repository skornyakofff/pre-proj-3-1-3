package ru.skornyakov.spring.boot_security.preproj313.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id", nullable = false)
    private int id;
    @Enumerated(EnumType.STRING)
    private EnumRole role;

    @Override
    public String getAuthority() {
        return role.name();
    }

    @Override
    public String toString() {
        return role.name().substring(5);
    }
}
