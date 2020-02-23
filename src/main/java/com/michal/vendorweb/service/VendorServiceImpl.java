package com.michal.vendorweb.service;

import com.michal.vendorweb.entities.Vendor;
import com.michal.vendorweb.repository.VendorRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Getter
public class VendorServiceImpl implements VendorService {

    @Autowired
    VendorRepository vendorRepository;

    @Override
    public Vendor saveVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    @Override
    public Vendor updateVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    @Override
    public void deleteVendor(int id) {
        vendorRepository.deleteById(id);

    }

    @Override
    public Vendor getVendorById(int id) {
        Optional<Vendor> vendorOptional= vendorRepository.findById(id);
        Vendor vendor = new Vendor();
        if (vendorOptional.isPresent()){
            vendor = vendorOptional.get();
        }
        return vendor;
    }

    @Override
    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }
}
