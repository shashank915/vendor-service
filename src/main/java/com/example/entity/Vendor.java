package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Vendor {
    @Id
    private String id = UUID.randomUUID().toString();
    private String name;
    private String email;
    private String mobile;
    private String address;
    private String gstNo;
}
