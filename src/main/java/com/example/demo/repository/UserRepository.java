package com.example.demo.repository;

import com.example.demo.crud.UserCrudRepository;
import com.example.demo.modelo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    @Autowired
    private UserCrudRepository crud;

    public List<User> getAll(){
        return (List<User>) crud.findAll();
    }

    public Optional<User> getUser(int id){
        return crud.findById(id);
    }

    public User save(User user){
        return  crud.save(user);
    }

    public Optional<User> existByEmail(String email){
        return crud.findByEmail(email);
    }

}
