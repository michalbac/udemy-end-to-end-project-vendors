package com.michal.vendorweb.controller;

import com.michal.vendorweb.entities.Vendor;
import com.michal.vendorweb.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/vendors")
public class VendorRestController {
    @Autowired
    VendorService vendorService;

    @PostMapping
    public Vendor createVendor(@RequestBody Vendor vendor) {
        return vendorService.saveVendor(vendor);
    }

   @DeleteMapping("/{id}")
    public void deleteVendor(@PathVariable int id) {
        vendorService.deleteVendor(id);
    }

    @PutMapping
    public Vendor updateVendor(@RequestBody Vendor vendor) {
        return vendorService.updateVendor(vendor);
    }

    @GetMapping("/{id}")
    public Vendor getVendor(@PathVariable int id){
        return vendorService.getVendorById(id);
    }

    @GetMapping
    public List<Vendor> getAllVendors(){
        return vendorService.getAllVendors();
    }



}
