package com.example.FirstCRUD;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ormonales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private float tsh;
    private float t4;
    private float tf4;
    private float t3;
    private float tf3;
    private float fsh;
    private float lh;
    private float prolactina;
    private float estradiol_e2;
    private String observaciones;
    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public float getTsh() { return tsh; }
    public float getT4() { return t4; }
    public float getTf4() { return tf4; }
    public float getT3() { return t3; }
    public float getTf3() { return tf3; }
    public float getFsh() { return fsh; }
    public float getLh() { return lh; }
    public float getProlactina() { return prolactina; }
    public float getEstradiol_e2() { return estradiol_e2; }
    public String getObservaciones() { return observaciones; }
    // Setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setTsh(float tsh){ this.tsh = tsh;}
    public void setT4(float t4){ this.t4 = t4;}
    public void setTf4(float tf4){ this.tf4 = tf4;}
    public void setT3(float t3){ this.t3 = t3;}
    public void setTf3(float tf3){ this.tf3 = tf3;}
    public void setFsh(float fsh){ this.fsh = fsh;}
    public void setLh(float lh){ this.lh = lh;}
    public void setProlactina(float prolactina){ this.prolactina = prolactina;}
    public void setEstradiol_e2(float estradiol_e2){ this.estradiol_e2 = estradiol_e2;}
    public void setObservaciones(String observaciones){ this.observaciones = observaciones;}

}
