package com.example.superuser.project_240916.model;

/**
 * Created by SuperUser on 24.09.2016.
 */
public class LocationTest {

    private int latitude;
    private int longitude;

    public LocationTest(int latitude, int longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public LocationTest() {

    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }
}
