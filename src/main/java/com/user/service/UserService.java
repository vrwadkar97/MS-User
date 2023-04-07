package com.user.service;

import com.user.entity.User;

import java.util.List;

public interface UserService {

    public User addUser(User user);

   // public List<User> getAllUser();

    public User getUser(String id);



}
