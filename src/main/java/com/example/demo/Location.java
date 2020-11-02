package com.example.demo;

public class Location{
    private final String name;
    private final String[] categories;
    private final String region;
    
    public Location(String name, String[] categories, String region){
        this.name=name;
        this.categories=categories;
        this.region=region;
    }
    public String getName(){
        return name;
    }
    public String[] getCategories(){
        return name;
    }
    public String getRegion(){
        return region;
    }
}
