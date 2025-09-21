package com.example.FirstCRUD;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cerologia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String factor_reumatoide;
    private String proteinaCReactiva;
    private String vdrl;
    private String vih;
    private String gonadotrofina_corionica_fraccionB;
    private String observaciones;
    
    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getObservaciones() { return observaciones; }
    public String getFactor_reumatoide() { return factor_reumatoide; }
    public String getProteinaCReactiva() { return proteinaCReactiva; }
    public String getVdrl() { return vdrl; }
    public String getVih() { return vih; }
    public String getGonadotrofina_corionica_fraccionB() { return gonadotrofina_corionica_fraccionB; }
    
    // Setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setFactor_reumatoide(String factor_reumatoide){ this.factor_reumatoide = factor_reumatoide;}
    public void setProteinaCReactiva(String proteinaCReactiva){ this.proteinaCReactiva = proteinaCReactiva;}
    public void setVdrl(String vdrl){ this.vdrl = vdrl;}
    public void setVih(String vih){ this.vih = vih;}
    public void setGonadotrofina_corionica_fraccionB(String gonadotrofina_corionica_fraccionB){ this.gonadotrofina_corionica_fraccionB = gonadotrofina_corionica_fraccionB;}
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

}
