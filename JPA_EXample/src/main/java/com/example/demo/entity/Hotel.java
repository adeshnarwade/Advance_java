package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HotelDB")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String hoteltype;
    private String quality;

    // ✅ No-argument constructor (required by JPA)
    public Hotel() {
    }

    // Parameterized constructor
    public Hotel(Long id, String name, String hoteltype, String quality) {
        this.id = id;
        this.name = name;
        this.hoteltype = hoteltype;
        this.quality = quality;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHoteltype() {
        return hoteltype;
    }

    public void setHoteltype(String hoteltype) {
        this.hoteltype = hoteltype;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Hotel [id=" + id + ", name=" + name + ", hoteltype=" + hoteltype + ", quality=" + quality + "]";
    }
}
