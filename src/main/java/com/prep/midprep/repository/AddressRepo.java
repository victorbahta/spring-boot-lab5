package com.prep.midprep.repository;

import com.prep.midprep.domain.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AddressRepo extends CrudRepository<Address, Long> {
    Address save(Address a);
    Optional<Address> findById(Long id);
}
