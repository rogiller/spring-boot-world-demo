package com.world.rest.dto;

/**
 * Created by Roger Diller on 1/23/16.
 */

public class Greeting {

    private final long id;
    private final String content;
    private String country;

    public Greeting(long id, String content, String country) {
        this.id = id;
        this.content = content;
        this.setCountry(country);
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
