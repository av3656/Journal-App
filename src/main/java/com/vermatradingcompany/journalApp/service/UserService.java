package com.vermatradingcompany.journalApp.service;

import com.vermatradingcompany.journalApp.entity.User;
import com.vermatradingcompany.journalApp.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
@Slf4j
public class UserService {

    private static final PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user){
        userRepository.save(user);
    }

    public void saveNewUser (User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Arrays.asList("user"));
        userRepository.save(user);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(ObjectId id){
        return userRepository.findById(id);
    }

    public void deleteById(ObjectId id){
        userRepository.deleteById(id);
    }

    public User findByUserName(String userName){
        return userRepository.findByUserName(userName);
    }
}
