package com.vermatradingcompany.journalApp.repository;

import com.vermatradingcompany.journalApp.entity.User;
import com.vermatradingcompany.journalApp.service.UserDetailsServiceImplementation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;


import static org.mockito.Mockito.*;


public class UserDetailsServiceImplementationTest {

    @InjectMocks
    private UserDetailsServiceImplementation userDetailsServiceImplementation;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    @Disabled void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @Disabled void loadUserByUsernameTest() {
        when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().userName("Abhay").password("qwertyuioiuytrew").roles(new ArrayList<>()).build());
        UserDetails user = userDetailsServiceImplementation.loadUserByUsername("Abhay");
        Assertions.assertNotNull(user);
    }
}
