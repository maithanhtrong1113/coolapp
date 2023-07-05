package com.example.coolapp.rest;

import com.example.coolapp.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachRest {
    private Coach coach;

    @Autowired
    public CoachRest(Coach theCoach){
        coach= theCoach;
    }
    @GetMapping("/coach")
    public String CoachEnponit(){
        return coach.getDailyWork();
    }

}
