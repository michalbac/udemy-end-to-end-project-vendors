package com.michal.vendorweb.service;

import com.michal.vendorweb.entities.Vendor;

import java.util.List;

public interface VendorService {
    Vendor saveVendor(Vendor vendor);

    Vendor updateVendor (Vendor vendor);

    void deleteVendor (int id);

    Vendor getVendorById(int id);

    List<Vendor> getAllVendors();


}
