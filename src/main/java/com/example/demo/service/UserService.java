package com.example.demo.service;

import com.example.demo.repository.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

//@Component
@Service
public class UserService {

    public List<User> helloWorld() {
        return List.of(
                new User(1L, "Evgenii", "mail@mail.ru",
                        LocalDate.of(1990,1, 1), 35),
                new User(2L, "Lera", "mail@mail.ru",
                        LocalDate.of(1991,2, 2), 34),
                new User(3L, "Savva", "mail@mail.ru",
                        LocalDate.of(1992,3, 3), 33));
    }
}
