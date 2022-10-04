package com.example.feignTest.model;

import java.time.LocalDateTime;
import java.util.Date;

public class Holidays {

    private Date date;
    private String name;
    private String type;
    private String level;

    public Holidays() {
    }

    public Holidays(Date date, String name, String type, String level) {
        this.date = date;
        this.name = name;
        this.type = type;
        this.level = level;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
