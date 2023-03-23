package com.example.aplikaatio2;

public class User {

    private String firstName;
    private String lastName;
    private String Email;
    private String DegreeProgram;

    protected int image;


    public User(String firstName, String lastName, String Email, String DegreeProgram, int image){
        this.firstName=firstName;
        this.lastName=lastName;
        this.Email=Email;
        this.DegreeProgram=DegreeProgram;
        this.image=image;
    }


    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEmail(){

        return Email;
    }

    public String getDegreeProgram(){

        return DegreeProgram;
    }

    public int getImage() {
        return image;
    }
}


