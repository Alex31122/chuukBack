package com.example.FirstCRUD;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class Sanguineas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private float glucosa;
    private float urea;
    private float creatina;
    private float acido_urico;
    private float colesterol;
    private float trigliceridos;
    private float hdl;
    private float ldl;
    private float vldl;
    private float indice_aterogenico;
    private float lipidos_totales;
    private float proteinas_totales;
    private float albumina;
    private float globulina;
    private float relacionAG;
    private float bilirrubina_total;
    private float bilirrubina_directa;
    private float bilirrubina_indirecta;
    private float dhl;
    private float alt;
    private float fosfatasa_alcalina;
    private float amilasa;
    private float lipasa;
    private float cpk_total;
    private float fraccion_MB;
    private float sodio;
    private float potasio;
    private float cloro;
    private String observaciones;

    // Getters
    public Long getId() {return id;}
    public String getName() { return name;}
    public float getGlucosa() {return glucosa;}
    public float getUrea() {return urea;}
    public float getCreatina() {return creatina;}
    public float getAcido_Urico() {return acido_urico;}
    public float getColesterol() {return colesterol;}
    public float getTrigiliceridos() {return trigliceridos;}
    public float getHdl() { return hdl; }
    public float getLdl() { return ldl; }
    public float getVldl() { return vldl; }
    public float getIndice_aterogenico() { return indice_aterogenico; }
    public float getLipidos_totales() { return lipidos_totales; }
    public float getAlbumia() { return albumina; }
    public float getGlobulina() { return globulina; }
    public float getRelacionAG() { return relacionAG; }
    public float getBilirrubuna_total() { return bilirrubina_total; }
    public float getBilirrubina_directa() { return bilirrubina_directa; }
    public float getBillirrubina_indirecta() { return bilirrubina_indirecta; }
    public float getDhl() { return dhl; }
    public float getAlt() { return alt; }
    public float getFosfata_alcalina() { return fosfatasa_alcalina; }
    public float getAmilasa() { return amilasa; }
    public float getLipasa() { return lipasa; }
    public float getCpk_total() { return cpk_total; }
    public float getFraccion_MB() { return fraccion_MB; }
    public float getSodio() { return sodio; }
    public float getPotasio() { return potasio; }
    public float getProteinas_totales() { return proteinas_totales; }
    public float getCloro() { return cloro; }
    public String getObservaciones() { return observaciones; }
        // Setters
    public void setId(Long id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setGlucosa(float glucosa){ this.glucosa = glucosa;}
    public void setUrea(float urea){ this.urea = urea;}
    public void setCreatina(float creatina){ this.creatina = creatina;}
    public void setAcido_urico(float acido_urico){ this.acido_urico = acido_urico;}
    public void setColesterol(float colesterol){ this.colesterol = colesterol;}
    public void setTrigliceridos(float trigliceridos){ this.trigliceridos = trigliceridos;}
    public void setHdl(float hdl){ this.hdl = hdl;}
    public void setLdl(float ldl){ this.ldl = ldl;}
    public void setVldl(float vldl){ this.vldl = vldl;}
    public void setIndice_aterogenico(float indice_aterogenico){ this.indice_aterogenico = indice_aterogenico;}
    public void setLipidos_totales(float lipidos_totales){ this.lipidos_totales = lipidos_totales;}
    public void setAlbumina(float albumina){ this.albumina = albumina;}
    public void setGlobulina(float globulina){ this.globulina = globulina;}
    public void setBilirrubina_total(float bilirrubina_total){ this.bilirrubina_total = bilirrubina_total;}
    public void setBilirrubina_directa(float bilirrubina_directa){ this.bilirrubina_directa = bilirrubina_directa;}
    public void setBilirrubina_indirecta(float bilirrubina_indirecta){ this.bilirrubina_indirecta = bilirrubina_indirecta;}
    public void setDhl(float dhl){ this.dhl = dhl;}
    public void setAlt(float alt){ this.alt = alt;}
    public void setFosfatasa_alcalina(float fosfatasa_alcalina){ this.fosfatasa_alcalina = fosfatasa_alcalina;}
    public void setAmilasa(float amilasa){ this.amilasa = amilasa;}
    public void setLipasa(float lipasa){ this.lipasa = lipasa;}
    public void setCpk_total(float cpk_total){ this.cpk_total = cpk_total;}
    public void setFraccion_MB(float fraccion_MB){ this.fraccion_MB = fraccion_MB;}
    public void setSodio(float sodio){ this.sodio = sodio;}
    public void setPotasio(float potasio){ this.potasio = potasio;}
    public void setCloro(float cloro){ this.cloro = cloro;}
    public void setObservaciones(String observaciones){ this.observaciones = observaciones;}

}
