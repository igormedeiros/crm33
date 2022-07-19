package br.com.igormedeiros.controller;

import br.com.igormedeiros.model.user.UserModel;
import br.com.igormedeiros.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(name = "/all")
    public List<UserModel> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping(name = "/new")
    public void addUser(@RequestBody UserModel userModel) {
        userRepository.save(userModel);
    }

    // TODO: get one User
    // TODO: update one User
    // TODO: delete one User
    // TODO: get all funnels of one user
    // TODO: get all tasks of one user
    // TODO: get all opportunities of one user
}
