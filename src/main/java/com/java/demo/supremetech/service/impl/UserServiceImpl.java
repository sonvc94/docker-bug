package com.java.demo.supremetech.service.impl;

import com.java.demo.supremetech.dao.Repository;
import com.java.demo.supremetech.model.User;
import com.java.demo.supremetech.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class UserServiceImpl implements Service {
    @Autowired
    private Repository repository;

//    @Override
//    public List<User> findAll() {
//        return repository.findAll();
//    }

    @Override
    public User findById(int id) {
        return repository.findById(id).get();
    }
}
