package com.dufuna.berlin.viktor.lekki;

import com.dufuna.berlin.viktor.lekki.model.LekkiProperty;
import com.dufuna.berlin.viktor.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.viktor.lekki.service.LekkiPropertyServiceImpl;

import java.util.List;

public class MockLekkiPropertyApp {
    public static void main(String[] args) {
        LekkiPropertyService service = new LekkiPropertyServiceImpl();

        for(int i = 1; i <= 10; i++){
            LekkiProperty property = new LekkiProperty();

            property.setPropertyId(i);
            property.setPropertyAddress("234 Lekki road " + i );
            property.setPropertyType("Flat");
            property.setNumBedroom(4 + i);
            property.setSittingRooms(2 + i);
            property.setNumKitchen(1 + i);
            property.setNumBathroom(4 + i);
            property.setNumToilet(4 + i);
            property.setPropertyOwner("Viktor " + i);
            property.setDescription("Nice apartment " + i);

            service.saveProperty(property);
        }


        System.out.println(service.getProperty(4));
        System.out.println("*******************************************");

        List<LekkiProperty> allProps = service.getProperties();
        for(LekkiProperty prop: allProps) {
            System.out.println(prop);
        }






        //service.saveProperty(property);
        //LekkiProperty property1 = service.getProperty();
    }
}
