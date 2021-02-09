package com.example.repository;

import com.example.entity.Vendor;
import org.springframework.data.repository.CrudRepository;

public interface VendorRepository extends CrudRepository<Vendor,String> {
}
