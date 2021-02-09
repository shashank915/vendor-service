package com.example.service;

import com.example.entity.Vendor;

import java.util.List;
import java.util.Optional;

public interface VendorService {
    Vendor createVendor(Vendor vendor);
    Vendor updateVendor(Vendor vendor);
    Optional<Vendor> getVendorById(String vendorId);
    List<Vendor> getAllVendors();
    void deleteVendor(String vendorId);
}
