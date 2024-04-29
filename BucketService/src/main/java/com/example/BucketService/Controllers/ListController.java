package com.example.BucketService.Controllers;

import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.BucketService.models.List;
import com.example.BucketService.repository.ListDBActions;
import com.example.BucketService.services.RequestSO;
import com.example.BucketService.services.ResponceSO;

@Component
@RestController
@RequestMapping("/list")
public class ListController {
    
    @RequestMapping(value = "/getCompleteList", method = RequestMethod.POST)
    public ResponseEntity<String> getCompleteListDetails(@RequestBody RequestSO requestSO) {
        try {
            
            List lst = new List(requestSO.getList(), requestSO.getTitle());
            ListDBActions.addNewList(lst);
        } catch (SQLException e) {
            return new ResponseEntity<>(e.getSQLState() +" Message : "+ e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return new ResponseEntity<>("Success",HttpStatus.OK);
    }
    
    @RequestMapping("/ms2")
    public String requestMethodName() {
        return "hello";
    }
}
