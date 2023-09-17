package hu.progmatic.bookdealers.service;


import hu.progmatic.bookdealers.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class UserService {
    private final List<User> users = new ArrayList<>();
    private final Random randomGenerator;

    public UserService(Random random) {

        this.randomGenerator = random;
        users.add(new User(00001, "Ági", 1978, 2023));
    }
    public void addUser(User user){ users.add(user);
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getRandomUser(){
        return users.get(randomGenerator.nextInt(users.size()));
    }

    public User getUser(int id){
        for (var actual : users){
            if (id == actual.getId()){
            return actual;
        }
    } return null;
    }
}