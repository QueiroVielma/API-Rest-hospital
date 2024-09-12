package com.hospital.service;

import com.hospital.entity.Bed;
import com.hospital.repository.BedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BedService {
    @Autowired
    private BedRepository bedRepository;

    public Bed create(Bed bed) {
        return bedRepository.save(bed);
    }

    public List<Bed> findAll() {
        return bedRepository.findAll();
    }

    public Bed findById(Long id) {
        return bedRepository.findById(id).get();
    }

    public Bed update(Long id, Bed bed) {
        bed.setId(id);
        return bedRepository.save(bed);
    }

    public void delete(Long id) {
        bedRepository.deleteById(id);
    }
}
