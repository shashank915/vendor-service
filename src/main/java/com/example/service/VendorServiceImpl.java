package com.example.service;

import com.example.entity.Vendor;
import com.example.repository.VendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendorServiceImpl implements VendorService {

    private final VendorRepository repository;

    public VendorServiceImpl(VendorRepository repository) {
        this.repository = repository;
    }

    @Override
    public Vendor createVendor(Vendor vendor) {
        return repository.save(vendor);
    }

    @Override
    public Vendor updateVendor(Vendor vendor) {
        return repository.save(vendor);
    }

    @Override
    public Optional<Vendor> getVendorById(String vendorId) {
        return repository.findById(vendorId);
    }

    @Override
    public List<Vendor> getAllVendors() {
        return (List<Vendor>)repository.findAll();
    }

    @Override
    public void deleteVendor(String vendorId) {
        repository.deleteById(vendorId);
    }
}
