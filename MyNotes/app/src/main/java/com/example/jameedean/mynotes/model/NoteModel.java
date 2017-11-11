package com.example.jameedean.mynotes.model;

/**
 * Created by JameeDean on 10/28/2017.
 */

public class NoteModel {
    private  String title;
    private String description;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title=title;

    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
}
