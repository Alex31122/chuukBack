package com.example.FirstCRUD;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HemoGlobinaGlucosilada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private float hemoglobina_glucosilada;
    private String observaciones;
    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getHemoglobina_glucosilada() {
        return hemoglobina_glucosilada;
    }

    public String getObservaciones() {
        return observaciones;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHemoglobina_glucosilada(float hemoglobina_glucosilada) {
        this.hemoglobina_glucosilada = hemoglobina_glucosilada;
    }

}
