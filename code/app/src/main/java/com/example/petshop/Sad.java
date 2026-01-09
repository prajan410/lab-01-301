package com.example.petshop;

import java.util.Date;

public class Sad extends Mood{
    public Sad() {
    }
    public Sad(Date todays_date) {
        super(todays_date);
    }

    @Override
    public String moodName() {
        return "Sad";
    }
}
