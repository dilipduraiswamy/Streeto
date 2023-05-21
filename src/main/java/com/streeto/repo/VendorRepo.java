package com.streeto.repo;

import com.streeto.entities.Vendor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepo extends MongoRepository<Vendor, String> {

}