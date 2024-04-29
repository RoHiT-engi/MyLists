package com.example.BucketService.services;

import java.util.HashSet;

public class ResponceSO {
    private HashSet<String> List;

    private String title;
    
    ResponceSO(HashSet<String> List,String title) {
        this.List = List;
        this.title = title;
    }

    public HashSet<String> getList() {
        return List;
    }

    public String getTitle() {
        return title;
    }
}
