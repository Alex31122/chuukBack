package com.example.FirstCRUD;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class CitometriaHematica {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private float leucocitos_totales;
    private float neutrofilos_porcentual;
    private float linfocitos_porcentual;
    private float monocitos_porcentual;
    private float neutrofilos;
    private float linfocitos;
    private float monocitos;
    private float eritrocitos;
    private float HGB;
    private float HTC;
    private float MCV;
    private float MCH;
    private float MCHC;
    private float RDW;
    private float plaquetas;
    private float VMP;
    private String grupo_sanguineo;
    private String factor_rh;
    private float VSG;
    private String observaciones;
    
    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getGrupo_sanguineo() { return grupo_sanguineo; }
    public String getFactor_rh() { return factor_rh; }
    public String getObservaciones() { return observaciones; }
    public float getVSG() { return VSG; }
    public float getLeucocitos_totales() { return leucocitos_totales; }
    public float getNeutrofilos_porcentual() { return neutrofilos_porcentual; }
    public float getLinfocitos_porcentual() { return linfocitos_porcentual; }
    public float getMonocitos_porcentual() { return monocitos_porcentual; }
    public float getNeutrofilos() { return neutrofilos; }
    public float getLinfocitos() { return linfocitos; }
    public float getMonocitos() { return monocitos; }
    public float getEritrocitos() { return eritrocitos; }
    public float getHGB() { return HGB; }
    public float getHTC() { return HTC; }
    public float getMCV() { return MCV; }
    public float getMCH() { return MCH; }
    public float getMCHC() { return MCHC; }
    public float getRDW() { return RDW; }
    public float getPlaquetas() { return plaquetas; }
    public float getVMP() { return VMP; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setGrupo_Sanguineo(String grupo_sanguineo) { this.grupo_sanguineo = grupo_sanguineo; }
    public void setName(String name) { this.name = name; }
    public void setFactor_rh(String factor_rh) { this.factor_rh = factor_rh; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }
    public void setLeucocitos_totales(float leucocitos_totales){ this.leucocitos_totales = leucocitos_totales;}
    public void setNeutrofilos_porcentual(float neutrofilos_porcentual){ this.neutrofilos_porcentual = neutrofilos_porcentual;}
    public void setLinfocitos_porcentual(float linfocitos_porcentual){ this.linfocitos_porcentual = linfocitos_porcentual;}
    public void setMonocitos_porcentual(float monocitos_porcentual){ this.monocitos_porcentual = monocitos_porcentual;}
    public void setNeutrofilos(float neutrofilos){ this.neutrofilos = neutrofilos;}
    public void setLinfocitos(float linfocitos){ this.linfocitos = linfocitos;}
    public void setMonocitos(float monocitos){ this.monocitos = monocitos;}
    public void setEritrocitos(float eritrocitos){ this.eritrocitos = eritrocitos;}
    public void setHGB(float HGB){ this.HGB = HGB;}
    public void setHTC(float HTC){ this.HTC = HTC;}
    public void setMCV(float MCV){ this.MCV = MCV;}
    public void setMCH(float MCH){ this.MCH = MCH;}
    public void setMCHC(float MCHC){ this.MCHC = MCHC;}
    public void setRDW(float RDW){ this.RDW = RDW;}
    public void setPlaquetas(float plaquetas){ this.plaquetas = plaquetas;}
    public void setVMP(float VMP){ this.VMP = VMP;}

}
