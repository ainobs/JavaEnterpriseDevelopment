package com.dufuna.berlin.viktor.lekki.service;

import com.dufuna.berlin.viktor.lekki.model.LekkiProperty;
import com.dufuna.berlin.viktor.lekki.repository.SimpleLekkiPropertyRepository;

import java.util.List;

public interface LekkiPropertyService {
    LekkiProperty saveProperty(LekkiProperty property);
    LekkiProperty getProperty(int id);
    List<LekkiProperty> getProperties();

}
