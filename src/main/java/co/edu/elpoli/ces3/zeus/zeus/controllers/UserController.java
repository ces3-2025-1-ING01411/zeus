package co.edu.elpoli.ces3.zeus.zeus.controllers;

import co.edu.elpoli.ces3.zeus.zeus.entities.User;
import co.edu.elpoli.ces3.zeus.zeus.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    public ResponseEntity<?> post(@RequestBody User input) {
        System.out.println("Received user: " + input);
        User user = repository.save(input);
        return ResponseEntity.ok(user);
    }
}
