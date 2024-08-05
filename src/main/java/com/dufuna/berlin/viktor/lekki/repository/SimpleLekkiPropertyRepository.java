package com.dufuna.berlin.viktor.lekki.repository;

import com.dufuna.berlin.viktor.lekki.model.LekkiProperty;

import java.util.List;

public interface SimpleLekkiPropertyRepository {
    LekkiProperty save(LekkiProperty prop);
    LekkiProperty findById(int id);
    List<LekkiProperty> findAll();
    LekkiProperty update(LekkiProperty prop);
}
