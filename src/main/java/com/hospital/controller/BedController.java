package com.hospital.controller;

import com.hospital.entity.Bed;
import com.hospital.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beds")
public class BedController {

    @Autowired
    private BedService bedService;

    // Criar um novo Bed
    @PostMapping
    public ResponseEntity<Bed> createBed(@RequestBody Bed bed) {
        return ResponseEntity.ok(bedService.create(bed));
    }

    // Listar todos os Beds
    @GetMapping
    public ResponseEntity<List<Bed>> getAllBeds() {
        return ResponseEntity.ok(bedService.findAll());
    }

    // Buscar um Bed por ID
    @GetMapping("/{id}")
    public ResponseEntity<Bed> getBedById(@PathVariable Long id) {
        Bed bed = bedService.findById(id);
        return bed != null ? ResponseEntity.ok(bed) : ResponseEntity.notFound().build();
    }

    // Atualizar um Bed existente
    @PutMapping("/{id}")
    public ResponseEntity<Bed> updateBed(@PathVariable Long id, @RequestBody Bed bed) {
        return ResponseEntity.ok(bedService.update(id, bed));
    }

    // Deletar um Bed
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBed(@PathVariable Long id) {
        bedService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
