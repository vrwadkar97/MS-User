package com.user.impl;

import com.user.dao.UserRepo;
import com.user.entity.User;
import com.user.exception.User_Already_Present;
import com.user.exception.User_Not_Found;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class UserImpl implements UserService {

    @Autowired
    private UserRepo repo;

    @Override
    public User addUser(User user) {
        User dbUser=null;
        String randomId= UUID.randomUUID().toString();
       user.setUserId(randomId);
        System.out.println(user.getUserId());
         dbUser=repo.findByUserId(user.getUserId());

         if(dbUser==null){
             dbUser=repo.save(user);
         }

         else{
           throw new User_Already_Present();
         }

        return dbUser;
    }

    @Override
    public User getUser(String id) {
        User dbUser=repo.findByUserId(id);
        if(dbUser==null){
            throw new User_Not_Found();
        }

        return dbUser;
    }
}
