package com.dufuna.berlin.viktor.lekki.service;

import com.dufuna.berlin.viktor.lekki.model.LekkiProperty;
import com.dufuna.berlin.viktor.lekki.repository.SimpleLekkiPropertyRepository;
import com.dufuna.berlin.viktor.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.List;

public class LekkiPropertyServiceImpl implements LekkiPropertyService{
    SimpleLekkiPropertyRepository repo = new SimpleLekkiPropertyRepositoryImpl();

    @Override
    public LekkiProperty saveProperty(LekkiProperty property) {
        return repo.save(property);
    }

    @Override
    public LekkiProperty getProperty(int id) {
        return repo.findById(id);
    }

    @Override
    public List<LekkiProperty> getProperties() {
        return repo.findAll();
    }
}
