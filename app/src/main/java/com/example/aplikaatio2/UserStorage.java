package com.example.aplikaatio2;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

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

    public void saveUsers(Context context){
        try{
            ObjectOutputStream userWrite = new ObjectOutputStream(context.openFileOutput("users.data", Context.MODE_PRIVATE));
            userWrite.writeObject(users);
            userWrite.close();
        } catch (IOException e){
            System.out.println("Käyttäjien tallentaminen epäonnistui");
        }
    }

    public void loadUsers(Context context){
        try{
            ObjectInputStream userRead = new ObjectInputStream(context.openFileInput("users.data"));
            users = (ArrayList<User>) userRead.readObject();
            userRead.close();
        } catch (FileNotFoundException e){
            System.out.println("Rakettien lukeminen ei onnistui");
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("Rakettinen lukeminen ei onnistut");
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            System.out.println("Rakettinen lukeminen ei onnistunut");
            e.printStackTrace();
        }
    }

}



