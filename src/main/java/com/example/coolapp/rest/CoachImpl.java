package com.example.coolapp.rest;

import com.example.coolapp.Coach;
import org.springframework.stereotype.Component;

@Component
public class CoachImpl implements Coach {
    @Override
    public String getDailyWork() {
        return "This is DailyWork";
    }
}
