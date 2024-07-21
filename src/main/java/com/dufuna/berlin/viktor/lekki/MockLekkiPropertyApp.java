package com.dufuna.berlin.viktor.lekki;

import com.dufuna.berlin.viktor.lekki.model.LekkiProperty;
import com.dufuna.berlin.viktor.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.viktor.lekki.service.MockLekkiPropertyService;

public class MockLekkiPropertyApp {
    public static void main(String[] args) {
        LekkiProperty property = new LekkiProperty();
        property.setPropertyId(1);
        property.setPropertyAddress("234 Lekki road");
        property.setPropertyType("Flat");
        property.setNumBedroom(4);
        property.setSittingRooms(2);
        property.setNumKitchen(1);
        property.setNumBathroom(4);
        property.setNumToilet(4);
        property.setPropertyOwner("Viktor");
        property.setDescription("Nice apartment");

        LekkiPropertyService service = new MockLekkiPropertyService();
        service.saveProperty(property);
        LekkiProperty property1 = service.getProperty();
    }
}
