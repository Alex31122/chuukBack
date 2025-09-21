package com.example.FirstCRUD;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TiemposCoagulacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private float protrombina;
    private float indice_internacional_normalizado;
    private float parcial_tromboplastina;
    private String observaciones;

    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public Float getProtrombina() { return protrombina; }
    public Float getIndice_internacional_normalizado() { return indice_internacional_normalizado; }
    public Float getParcial_tromboplastina() { return parcial_tromboplastina; }
    public String getObservaciones() { return observaciones; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setProtombina(float protrombina){ this.protrombina = protrombina;}
    public void setIndice_internacional_normalizado(float indice_internacional_normalizado){ this.indice_internacional_normalizado = indice_internacional_normalizado;}
    public void setParcial_tromboplastina(float parcial_tromboplastina){ this.parcial_tromboplastina = parcial_tromboplastina;}
    public void setObservaciones(String observaciones){ this.observaciones = observaciones;}

}
