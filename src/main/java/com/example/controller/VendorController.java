package com.example.controller;

import com.example.entity.Vendor;
import com.example.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
public class VendorController {

    private final VendorService vendorService;

    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @PostMapping("/api/v1/vendors/add")
    public ResponseEntity<Vendor> createVendor(@RequestBody Vendor vendor){
        return ResponseEntity.ok(vendorService.createVendor(vendor));
    }

    @PutMapping("/api/v1/vendors/update")
    public ResponseEntity<Vendor> updareVendor(@RequestBody Vendor vendor){
        return ResponseEntity.ok(vendorService.updateVendor(vendor));
    }

    @GetMapping("/api/v1/vendors/{vendorId}")
    public ResponseEntity<Vendor> getVendor(@PathVariable String vendorId){
        Optional<Vendor> vendorById = vendorService.getVendorById(vendorId);
        if(vendorById.isPresent()){
            return ResponseEntity.ok(vendorById.get());
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/api/v1/vendors")
    public List<Vendor> getAllVendors(){
        return vendorService.getAllVendors();
    }

}
