package com.prep.midprep.controller;

import com.prep.midprep.domain.Address;
import com.prep.midprep.repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addresses")
public class AddressController {
    @Autowired
    AddressRepo addressRepo;
    @PostMapping
    public void saveAddress(@RequestBody Address address) {
        addressRepo.save(address);
    }

}
