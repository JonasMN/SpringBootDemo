package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ApplicationUser;

@Service("applicationService")
public class ApplicationService {

    @Autowired
    DbService dbService;

    public List<ApplicationUser> getUsersExample() {
        return dbService.getUsersExample();
    }
    
    public List<ApplicationUser> getUsers() {
        return dbService.getUsersFromDatabase();
    }
}
