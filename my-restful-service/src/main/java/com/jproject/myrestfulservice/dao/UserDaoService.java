package com.jproject.myrestfulservice.dao;

import com.jproject.myrestfulservice.bean.User;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int userCount = 3;

    static {
        users.add(new User(1, "Kenneth", new Date()));
        users.add(new User(2, "Alice", new Date()));
        users.add(new User(3, "Elena", new Date()));
    }

    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        if(user.getId() == null ){
            user.setId(users.size()+1);
        }
        if(user.getJoinDate() == null){
            user.setJoinDate(new Date());
        }
        users.add(user);

        return user;
    }

    public User findOne(int id){
        for(User user: users){
            if(user.getId() == id){
                return user;
            }
        }

        return null;
    }
}
