package com.example.FirstCRUD;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CurvaToleranciaGlucosa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private float glucosa_basal;
    private float glucosa1hr;
    private float glucosa2hr;
    private float glucosa3hr;
    private String observaciones;
    
    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }

    public float getGlucosa_basal() { return glucosa_basal; }
    public float getGlucosa_glucosa1hr() { return glucosa1hr; }
    public float getGlucosa_glucosa2hr() { return glucosa2hr; }
    public float getGlucosa_glucosa3hr() { return glucosa3hr; }
    public String getObservaciones() { return observaciones; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setGlucosa_basal(float hemoglobina_glucosilada) { this.glucosa_basal = hemoglobina_glucosilada; }
    public void setGlucosa1hr(float glucosa1hr) { this.glucosa1hr = glucosa1hr; }
    public void setGlucosa2hr(float glucosa2hr) { this.glucosa2hr = glucosa2hr; }
    public void setGlucosa3hr(float glucosa3hr) { this.glucosa3hr = glucosa3hr; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }
}
