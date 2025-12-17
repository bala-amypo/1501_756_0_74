package com.example.demo.service;
public interface LoactionServiceImpl implements LocationService{
   @Autowired
   LocationRepository Locationrepo;
   @Override
   public LocationEntity createlocation(LocationEntity le){
    return Locationrepo.save(le);
   }
}