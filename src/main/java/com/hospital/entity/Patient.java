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
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int age;
    private Double weight;
    private String contact;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "patient")
    @JsonManagedReference
    private  Bed bed;
    @ManyToOne
    @JsonManagedReference
    private Doctor doctor;
}
