package com.company;

public class Author {
    private Char gender;
    private String name;
    private String email;

    public Author(String n, String e, Char g){
        name = n;
        email = e;
        gender = g;
    }

    public String getName(){ return name; }
    public String getEmail(){ return email; }
    public Char getGender(){ return gender; }

    public String setEmail(){ return this.email = email; }

    public String toString()
    {
        return "Author - " + this.name + " (" + this.gender + ")" + " at " + this.email;
    }

}