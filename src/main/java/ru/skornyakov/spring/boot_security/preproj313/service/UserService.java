package ru.skornyakov.spring.boot_security.preproj313.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.skornyakov.spring.boot_security.preproj313.entities.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    User findByUsername(String username);
    void saveUser(User user);
    void deleteUser(Long id);
    User getUserById(Long id);
    List<User> getAllUsers();
}
