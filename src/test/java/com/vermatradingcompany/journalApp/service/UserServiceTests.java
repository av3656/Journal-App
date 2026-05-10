package com.vermatradingcompany.journalApp.service;

import com.vermatradingcompany.journalApp.entity.User;
import com.vermatradingcompany.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.CsvSources;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;


    @ParameterizedTest
//    @ValueSource(strings = {
//            "Aman",
//            "Akshu",
//            "Abhay"
//    })
    @ArgumentsSource(UserArgumentsProvider.class)
   @Disabled public void testSaveNewUser(User user) {
        assertTrue(userService.saveNewUser(user));
    }


    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "4,5,9",
    })
    @Disabled public void test(int a, int b, int expected) {
        assertEquals(expected, a + b);
    }

}
