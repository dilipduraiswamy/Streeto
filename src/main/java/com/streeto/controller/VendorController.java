package com.streeto.controller;

import com.streeto.entities.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendor")
public class VendorController {

    @Autowired
    private com.streeto.repo.VendorRepo vendorRepo;
    @GetMapping("/")
    private String getAllVendors(){
        return "vendors";
    }

    @PostMapping("/")
    private String save(@RequestBody Vendor vendor)
    {
        return vendorRepo.save(vendor).getId();
    }
}
