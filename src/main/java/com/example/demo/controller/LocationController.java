package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationService locationservice;

    @PostMapping("/add")
    public LocationEntity add(@RequestBody LocationEntity le) {
        return locationservice.createlocation(le);
    }

    @GetMapping("/all")
    public List<LocationEntity> show() {
        return locationservice.getalllocation();
    }
}
