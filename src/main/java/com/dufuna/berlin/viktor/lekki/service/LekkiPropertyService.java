package com.dufuna.berlin.viktor.lekki.service;

import com.dufuna.berlin.viktor.lekki.model.LekkiProperty;

public interface LekkiPropertyService {
    void saveProperty(LekkiProperty property);
    LekkiProperty getProperty();

}
