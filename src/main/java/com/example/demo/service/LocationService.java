package com.example.demo;

import java.util.List;

public interface LocationService {

    LocationEntity createlocation(LocationEntity le);

    List<LocationEntity> getalllocation();
}
