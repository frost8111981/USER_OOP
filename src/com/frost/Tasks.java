package com.frost;

public class Tasks {
    int id;
    String subject;
    String information;



    public Tasks(int id, String subject, String information){
        this.id = id;
        this.subject = subject;
        this.information = information;
    }

    public Tasks(){
    }

    public String toString(){
        return id + ") " + subject + " - " + information;
    }
}
