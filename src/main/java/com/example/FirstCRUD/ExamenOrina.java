package com.example.FirstCRUD;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class ExamenOrina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String color;
    private String aspecto;
    private float densidad_especifica;
    private float aprox_ph;
    private String proteinas;
    private String sangre;
    private String bilirrubina;
    private String glucosa;
    private String cuerpos_cetonicos;
    private String nitritos;
    private String urobilinogeno;
    private String leucocitos;
    private String eritrocitos;
    private String celulas;
    private String cristales;
    private String mucina;
    private String bacterias;
    private String observaciones;
    
    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getColor() { return color; }
    public String getAspecto() { return aspecto; }
    public float getDensidad_especifica() { return densidad_especifica; }
    public float getAprox_ph() { return aprox_ph; }
    public String getProteinas() { return proteinas; }
    public String getSangre() { return sangre; }
    public String getBilirrubina() { return bilirrubina; }
    public String getGlucosa() { return glucosa; }
    public String getCuerpos_cetonicos() { return cuerpos_cetonicos; }
    public String getNitritos() { return nitritos; }
    public String getUrobilinogeno() { return urobilinogeno; }
    public String getLeucocitos() { return leucocitos; }
    public String getEritrocitos() { return eritrocitos; }
    public String getCelulas() { return celulas; }
    public String getCristales() { return cristales; }
    public String getMucina() { return mucina; }
    public String getBacterias() { return bacterias; }
    public String getObservaciones() { return observaciones; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setColor(String color){ this.color = color;}
    public void setAspecto(String aspecto){ this.aspecto = aspecto;}
    public void setDensidad_especifica(float densidad_especifica){ this.densidad_especifica = densidad_especifica;}
    public void setAprox_ph(float aprox_ph){ this.aprox_ph = aprox_ph;}
    public void setProteinas(String proteinas){ this.proteinas = proteinas;}
    public void setSangre(String sangre){ this.sangre = sangre;}
    public void setBilirrubina(String bilirrubina){ this.bilirrubina = bilirrubina;}
    public void setGlucosa(String glucosa){ this.glucosa = glucosa;}
    public void setCuerpos_cetonicos(String cuerpos_cetonicos){ this.cuerpos_cetonicos = cuerpos_cetonicos;}
    public void setNitritos(String nitritos){ this.nitritos = nitritos;}
    public void setUrobilinogeno(String urobilinogeno){ this.urobilinogeno = urobilinogeno;}
    public void setLeucocitos(String leucocitos){ this.leucocitos = leucocitos;}
    public void setEritrocitos(String eritrocitos){ this.eritrocitos = eritrocitos;}
    public void setCelulas(String celulas){ this.celulas = celulas;}
    public void setCristales(String cristales){ this.cristales = cristales;}
    public void setMucina(String mucina){ this.mucina = mucina;}
    public void setBacterias(String bacterias){ this.bacterias = bacterias;}
    public void setObservaciones(String observaciones){ this.observaciones = observaciones;}

}
