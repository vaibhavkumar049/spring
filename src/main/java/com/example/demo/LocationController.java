package com.example.demo;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import okhttp3.*;
import jackson-databind.*;
import java.io.IOException;

@RestController
public class LocationController{

    // private final AtomicLong counter = new AtomicLong();
    @GetMapping("/itinerary")
    public String location(){
        private final OkHttpClient httpClient = new OkHttpClient();
        
        String urlMus="https://api.mapbox.com/geocoding/v5/mapbox.places/museum.json?bbox=26.699524,40.388397,30.418396,41.709829&limit=10&access_token=sk.eyJ1IjoidmFpYmhhdmt1bWFyMDQ5IiwiYSI6ImNrZ3pneHkxcDBvMHMyc252c2ExbDQ0MzcifQ.FUSwux5Z-gOJ_EielO0FaA"
        Request req = new Request.Builder().url(urlMus).build();
        Response response = httpClient.newCall(req).execute();
        // APOD apod = mapper.readValue(response.body().byteStream(), APOD.class);
        
        // Location[] loc = new Location[10];
        // List<Location> l = new ArrayList<Location>();
        // for(String name:features){
        //     Location l = new Location();
        // }

        System.out.println(apod.features[0].text);
        return response.body().string();
    }

}