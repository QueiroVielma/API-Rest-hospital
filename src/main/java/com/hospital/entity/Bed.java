package com.hospital.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Bed {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int unit;
    private boolean occupied;
    @OneToOne
    @JoinColumn (name = "patient_id", referencedColumnName = "id")
    @JsonManagedReference
    private Patient patient;
    @ManyToOne
    @JsonManagedReference
    private HealthUnit healthUnit;
}
