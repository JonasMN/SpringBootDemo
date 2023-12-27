package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ApplicationUser;


@Service("DbService")
public class DbService {
	
	private final UserRepository userRepository;

    @Autowired
    public DbService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<ApplicationUser> getUsersExample() {
        List<ApplicationUser> usuarios = new ArrayList<>();
        
        usuarios.add(new ApplicationUser("Juan", "Pérez", "123456789", "12345678A", "juan@example.com"));
        usuarios.add(new ApplicationUser("María", "Gómez", "987654321", "87654321B", "maria@example.com"));
        usuarios.add(new ApplicationUser("Carlos", "Martínez", "555555555", "76543210C", "carlos@example.com"));
        usuarios.add(new ApplicationUser("Laura", "López", "111111111", "65432109D", "laura@example.com"));
        usuarios.add(new ApplicationUser("Pedro", "Sánchez", "999999999", "54321098E", "pedro@example.com"));

        return usuarios;
    }
    
    public List<ApplicationUser> getUsersFromDatabase() {
        return userRepository.findAll();
    }
}
