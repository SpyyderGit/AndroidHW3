package com.example.superuser.project_240916.model;

/**
 * Created by SuperUser on 24.09.2016.
 */
public class StoreTest {
    public StoreTest() {
    }

    private int id;
    private String name;
    private String address;
    private String phone;
    private LocationTest location;

    public StoreTest(int id, String name, String address,
                     String phone, LocationTest location) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public StoreTest setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public StoreTest setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public StoreTest setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public StoreTest setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public LocationTest getLocation() {
        return location;
    }

    public StoreTest setLocation(LocationTest location) {
        this.location = location;
        return this;
    }
}
