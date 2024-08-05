package com.dufuna.berlin.viktor.lekki.repository;

import com.dufuna.berlin.viktor.lekki.model.LekkiProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository{

    HashMap<Integer, LekkiProperty> propMap = new HashMap<>();

    @Override
    public LekkiProperty save(LekkiProperty prop) {
        propMap.put(prop.getPropertyId(), prop);
        return prop;
    }

    @Override
    public LekkiProperty findById(int id) {
        return propMap.get(id);
    }

    @Override
    public List<LekkiProperty> findAll() {
        ArrayList<LekkiProperty> propList = new ArrayList<>(propMap.values());
        return propList;
    }

    @Override
    public LekkiProperty update(LekkiProperty prop) {
        if (propMap.containsKey(prop.getPropertyId())) {
            propMap.put(prop.getPropertyId(), prop);
        }
        return prop;
    }
}
