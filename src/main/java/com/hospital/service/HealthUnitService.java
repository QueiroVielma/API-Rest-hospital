package com.hospital.service;

import com.hospital.entity.HealthUnit;
import com.hospital.repository.HealthUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthUnitService {
    @Autowired
    private HealthUnitRepository healthUnitRepository;

    public HealthUnit create(HealthUnit healthUnit) {
        return healthUnitRepository.save(healthUnit);
    }

    public List<HealthUnit> findAll() {
        return healthUnitRepository.findAll();
    }

    public HealthUnit findById(Long id) {
        return healthUnitRepository.findById(id).get();
    }

    public HealthUnit update(Long id, HealthUnit healthUnit) {
        healthUnit.setId(id);
        return healthUnitRepository.save(healthUnit);
    }

    public void delete(Long id) {
        healthUnitRepository.deleteById(id);
    }
}
