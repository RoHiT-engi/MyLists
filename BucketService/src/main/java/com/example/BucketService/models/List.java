package com.example.BucketService.models;

import java.util.HashSet;

public class List {
    // Completed Tasks
    private HashSet<String> CompletedTasks;
    // Remaining Tasks
    private HashSet<String> RemTasks;
    // List title
    private String title;
    // Schedule Request
    public List(HashSet<String> Tasks, String title) {
        this.CompletedTasks = new HashSet<>();;
        this.RemTasks = Tasks;
        this.title = title;
    }

    // public void setLst(HashSet<String> lst) {
    //     Lst = lst;
    // }
    
    // public void setTitle(String title) {
    //     this.title = title;
    // }

    // public HashSet<String> getAllLst() {
    //     HashSet<String> hash = new HashSet<>();
    //     hash.addAll(CompletedTasks);
    //     hash.addAll(RemTasks);
    //     return hash;
    // }

    public HashSet<String> getCompletedTasks() {
        return CompletedTasks;
    }

    public HashSet<String> getRemTasks() {
        return RemTasks;
    }

    public String getTitle() {
        return title;
    }
}
