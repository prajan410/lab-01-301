package com.example.petshop;

import java.util.Date;

public abstract class Mood {

    private Date todays_date;

    public Mood() {
        this.todays_date = new Date();
    }
    public Mood(Date todays_date) {
        this.todays_date = todays_date;
    }

    public Date getTodays_date() {
        return todays_date;
    }

    public void setTodays_date(Date todays_date) {
        this.todays_date = todays_date;
    }

    public abstract String moodName();
}
