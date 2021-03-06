package com.michal.vendorweb.repository;

import com.michal.vendorweb.entities.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface VendorRepository extends JpaRepository<Vendor, Integer> {
}
