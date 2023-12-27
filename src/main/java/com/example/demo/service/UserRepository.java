package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.ApplicationUser;

public interface UserRepository extends JpaRepository<ApplicationUser, Long> {
}
