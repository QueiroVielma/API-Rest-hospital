package com.hospital.controller;

import com.hospital.entity.HealthUnit;
import com.hospital.service.HealthUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/healthUnits")
public class HealthUnitController {

    @Autowired
    private HealthUnitService healthUnitService;

    // Criar uma nova HealthUnit
    @PostMapping
    public ResponseEntity<HealthUnit> createHealthUnit(@RequestBody HealthUnit healthUnit) {
        return ResponseEntity.ok(healthUnitService.create(healthUnit));
    }

    // Listar todas as HealthUnits
    @GetMapping
    public ResponseEntity<List<HealthUnit>> getAllHealthUnits() {
        return ResponseEntity.ok(healthUnitService.findAll());
    }

    // Buscar uma HealthUnit por ID
    @GetMapping("/{id}")
    public ResponseEntity<HealthUnit> getHealthUnitById(@PathVariable Long id) {
        HealthUnit healthUnit = healthUnitService.findById(id);
        return healthUnit != null ? ResponseEntity.ok(healthUnit) : ResponseEntity.notFound().build();
    }

    // Atualizar uma HealthUnit existente
    @PutMapping("/{id}")
    public ResponseEntity<HealthUnit> updateHealthUnit(@PathVariable Long id, @RequestBody HealthUnit healthUnit) {
        return ResponseEntity.ok(healthUnitService.update(id, healthUnit));
    }

    // Deletar uma HealthUnit
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHealthUnit(@PathVariable Long id) {
        healthUnitService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
