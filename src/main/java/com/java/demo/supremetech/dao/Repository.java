package com.java.demo.supremetech.dao;

import com.java.demo.supremetech.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<User, Integer> {
}
