package com.dianaglobal.walletgeneration.repository;

import com.dianaglobal.walletgeneration.model.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<Address, String> {
}
