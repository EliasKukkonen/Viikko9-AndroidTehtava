package com.example.aplikaatio2;

import java.util.ArrayList;

public class UserStorage {

    private ArrayList<User> users = new ArrayList<>();


    private static UserStorage userstorage = null;


    private UserStorage(){
    }

    public static UserStorage getInstance(){
        if(userstorage == null){
            userstorage = new UserStorage();
        }

        return userstorage;
    }

    public void addStudentToList(User user){
        users.add(user);
    }


    public ArrayList<User> getUsers() {
        return users;
    }
}



