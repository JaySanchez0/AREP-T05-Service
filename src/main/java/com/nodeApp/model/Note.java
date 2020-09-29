package com.nodeApp.model;

public class Note {
    private String affair;
    private String description;

    public Note(String affair, String description){
        this.affair = affair;
        this.description = description;
    }

    public String getAffair() {
        return affair;
    }

    public void setAffair(String affair) {
        this.affair = affair;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
