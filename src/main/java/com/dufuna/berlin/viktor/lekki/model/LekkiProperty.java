package com.dufuna.berlin.viktor.lekki.model;

import java.util.Date;
import java.util.Objects;

public class LekkiProperty {
    int propertyId;
    String propertyAddress;
    String propertyType;
    int numBedroom;
    int sittingRooms;
    int numKitchen;
    int numBathroom;
    int numToilet;
    String propertyOwner;
    String description;
    Date validFrom;
    Date validTo;


    public LekkiProperty() {
    }

    public int getPropertyId() {
        return propertyId;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public int getNumBedroom() {
        return numBedroom;
    }

    public int getSittingRooms() {
        return sittingRooms;
    }

    public int getNumKitchen() {
        return numKitchen;
    }

    public int getNumBathroom() {
        return numBathroom;
    }

    public int getNumToilet() {
        return numToilet;
    }

    public String getPropertyOwner() {
        return propertyOwner;
    }

    public String getDescription() {
        return description;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public void setNumBedroom(int numBedroom) {
        this.numBedroom = numBedroom;
    }

    public void setSittingRooms(int sittingRooms) {
        this.sittingRooms = sittingRooms;
    }

    public void setNumKitchen(int numKitchen) {
        this.numKitchen = numKitchen;
    }

    public void setNumBathroom(int numBathroom) {
        this.numBathroom = numBathroom;
    }

    public void setNumToilet(int numToilet) {
        this.numToilet = numToilet;
    }

    public void setPropertyOwner(String propertyOwner) {
        this.propertyOwner = propertyOwner;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    @Override
    public String toString() {
        return propertyId + "," + propertyAddress  + "," + propertyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LekkiProperty that)) return false;
        return getPropertyId() == that.getPropertyId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPropertyId());
    }

}
