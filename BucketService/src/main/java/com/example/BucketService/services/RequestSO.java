package com.example.BucketService.services;

import java.util.HashSet;

public class RequestSO {
    private HashSet<String> List;

    private String title;
    
    RequestSO(HashSet<String> List, String title) {
        // this.List = new HashSet<>();
        // while (List.hasNext()) {

        // }
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
