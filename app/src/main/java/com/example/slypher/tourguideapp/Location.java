package com.example.slypher.tourguideapp;

import java.io.Serializable;

public class Location implements Serializable{
    private String locationName;
    private String locationInfoOpen;
    private String locationInfoAddress;
    private String locationInfoTelephone;
    private String locationInfoEmail;
    private String locationInfoWeb;
    private String locationDescription;
    private int locationImageResourceId;
    private int locationIconResourceId;

    public Location(String name, String open, String address, String telephone, String email, String web, String description, int imageResourceId, int iconResourceId)
    {
        locationName = name;
        locationInfoOpen = open;
        locationInfoAddress = address;
        locationInfoTelephone = telephone;
        locationInfoEmail = email;
        locationInfoWeb = web;
        locationDescription = description;
        locationImageResourceId = imageResourceId;
        locationIconResourceId = iconResourceId;
    }

    public String getLocationName() {
        return locationName;
    }

    public String getLocationInfoOpen() {
        return locationInfoOpen;
    }

    public String getLocationInfoAddress() {
        return locationInfoAddress;
    }

    public String getLocationInfoTelephone() {
        return locationInfoTelephone;
    }

    public String getLocationInfoEmail() {
        return locationInfoEmail;
    }

    public String getLocationInfoWeb() {
        return locationInfoWeb;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public int getLocationImageResourceId() {
        return locationImageResourceId;
    }

    public int getLocationIconResourceId() {
        return locationIconResourceId;
    }
}
