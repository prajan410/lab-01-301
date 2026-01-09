package com.example.petshop;

import java.util.Date;

public class Happy extends Mood{

    public Happy() {
    }
    public Happy(Date todays_date) {
        super(todays_date);
    }

    @Override
    public String moodName() {
        return "Happy";
    }
}
