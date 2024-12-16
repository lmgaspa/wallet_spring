package com.dianaglobal.walletgeneration.repository;

import com.dianaglobal.walletgeneration.model.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends MongoRepository<Address, String> {
    @Query("{ 'userId' : ?0 }")
    Optional<Address> findByUserId(String userId);
}


