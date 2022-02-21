package ru.idgroup.otus.ms.userapp.controllers;

import org.springframework.web.bind.annotation.*;
import ru.idgroup.otus.ms.userapp.model.User;
import ru.idgroup.otus.ms.userapp.services.UserService;

@RestController
@RequestMapping("/v1/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("{id}")
    User getUser(@PathVariable("id") Integer userId ) {
        return userService.findById(userId).orElseThrow(() -> new RuntimeException("erer"));
    }

    @DeleteMapping("{id}")
    void deleteUser(@PathVariable("id") Integer userId) {
        userService.deleteById(userId);
    }

    @PostMapping
    void saveUser(@RequestBody User user) {
        userService.save(user);
    }

    @PutMapping("{id}")
    void updateUser(@PathVariable("id") Integer userId, @RequestBody User user) {
        User oldUser = userService.findById(userId).orElseThrow(() -> new IllegalArgumentException("user not found"));
        user.setId(userId);
        userService.save(user);
    }
}
