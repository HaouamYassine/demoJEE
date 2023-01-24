package com.example.demojee.dao;

import com.example.demojee.entities.User;

import java.util.ArrayList;
import java.util.List;

public class MemoryDao {


    private static List<User> userlist = new ArrayList<User>(){{
        add(new User(1L,"sauvageb","Boris","SAUVAGE"));
        add(new User(2l,"johdoe","John","DOE"));
    }};

    public MemoryDao() {
    }


    public boolean create(User user){
        user.setId((long)userlist.size()+1);
        return userlist.add(user);

    }

    public List<User> getAll(){
        return userlist;


        //TODO:...
    }

}
