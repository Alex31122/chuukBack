package com.example.FirstCRUD;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Gastometria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private float pH;
    private float pCO2;
    private float cHCO3;
    private float BE;
    private float cSO2;
    private float sodio;
    private float calcio;
    private float tco2;
    private float be;
    private float glucosa;
    private float lactato;
    private float Hct;
    private float cHgb;
    private String tipoDeMuestra;
    private float fiO2;
    private float temperatura;
    private String observaciones;
    
    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public float getSodio() { return sodio; }
    public float getpH() { return pH; }
    public float getpCO2() { return pCO2; }
    public float getcHCO3() { return cHCO3; }
    public float getBE() { return BE; }
    public float getcSO2() { return cSO2; }
    public float getCalcio() { return calcio; }
    public float getTco2() { return tco2; }
    public float getBe() { return be; }
    public float getGlucosa() { return glucosa; }
    public float getLactato() { return lactato; }
    public float getsct() { return Hct; }
    public float getCHgb() { return cHgb; }
    public String getTipoDeMuestra() { return tipoDeMuestra; }
    public float getFiO2() { return fiO2; }
    public float getTemperatura() { return temperatura; }
    public String getObservaciones() { return observaciones; }

    // Setters
    public void setCalcio(float calcio){ this.calcio = calcio;}
    public void setTco2(float tco2){ this.tco2 = tco2;}
    public void setBe(float be){ this.be = be;}
    public void setGlucosa(float glucosa){ this.glucosa = glucosa;}
    public void setLactato(float lactato){ this.lactato = lactato;}
    public void setct(float Hct){ this.Hct = Hct;}
    public void setCHgb(float cHgb){ this.cHgb = cHgb;}
    public void setTipoDeMuestra(String tipoDeMuestra){ this.tipoDeMuestra = tipoDeMuestra;}
    public void setFiO2(float fiO2){ this.fiO2 = fiO2;}
    public void setTemperatura(float temperatura){ this.temperatura = temperatura;}
    public void setObservaciones(String observaciones){ this.observaciones = observaciones;}
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setpH(float factor_reumatoide){ this.pH = factor_reumatoide;}
    public void setpCO2(float proteinaCReactiva){ this.pCO2 = proteinaCReactiva;}
    public void setcHCO3(float vdrl){ this.cHCO3 = vdrl;}
    public void setBE(float vih){ this.BE = vih;}
    public void setcSO2(float gonadotrofina_corionica_fraccionB){ this.cSO2 = gonadotrofina_corionica_fraccionB;}
    public void setSodio(float sodio) { this.sodio = sodio; }
}
