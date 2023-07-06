package com.descriptores.sistema.modelo;

import javax.persistence.*;

@Entity
@Table(name = "material")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long materialId;

    private String equipos1;
    private String equipos2;
    private String equipos3;
    private String equipos4;
    private String equipos5;
    private String equipos6;
    private String equipos7;
    private String equipos8;
    private String materiales1;
    private String materiales2;
    private String materiales3;
    private String materiales4;
    private String materiales5;
    private String materiales6;
    private String materiales7;
    private String materiales8;
    private String servicio1;
    private String servicio2;
    private String infraestructura1;
    private String infraestructura2;
    private String infraestructura3;
    private String infraestructura4;

    @ManyToOne(fetch = FetchType.EAGER)
    private Curso curso;

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public String getEquipos1() {
        return equipos1;
    }

    public void setEquipos1(String equipos1) {
        this.equipos1 = equipos1;
    }

    public String getEquipos2() {
        return equipos2;
    }

    public void setEquipos2(String equipos2) {
        this.equipos2 = equipos2;
    }

    public String getEquipos3() {
        return equipos3;
    }

    public void setEquipos3(String equipos3) {
        this.equipos3 = equipos3;
    }

    public String getEquipos4() {
        return equipos4;
    }

    public void setEquipos4(String equipos4) {
        this.equipos4 = equipos4;
    }

    public String getEquipos5() {
        return equipos5;
    }

    public void setEquipos5(String equipos5) {
        this.equipos5 = equipos5;
    }

    public String getEquipos6() {
        return equipos6;
    }

    public void setEquipos6(String equipos6) {
        this.equipos6 = equipos6;
    }

    public String getEquipos7() {
        return equipos7;
    }

    public void setEquipos7(String equipos7) {
        this.equipos7 = equipos7;
    }

    public String getEquipos8() {
        return equipos8;
    }

    public void setEquipos8(String equipos8) {
        this.equipos8 = equipos8;
    }

    public String getMateriales1() {
        return materiales1;
    }

    public void setMateriales1(String materiales1) {
        this.materiales1 = materiales1;
    }

    public String getMateriales2() {
        return materiales2;
    }

    public void setMateriales2(String materiales2) {
        this.materiales2 = materiales2;
    }

    public String getMateriales3() {
        return materiales3;
    }

    public void setMateriales3(String materiales3) {
        this.materiales3 = materiales3;
    }

    public String getMateriales4() {
        return materiales4;
    }

    public void setMateriales4(String materiales4) {
        this.materiales4 = materiales4;
    }

    public String getMateriales5() {
        return materiales5;
    }

    public void setMateriales5(String materiales5) {
        this.materiales5 = materiales5;
    }

    public String getMateriales6() {
        return materiales6;
    }

    public void setMateriales6(String materiales6) {
        this.materiales6 = materiales6;
    }

    public String getMateriales7() {
        return materiales7;
    }

    public void setMateriales7(String materiales7) {
        this.materiales7 = materiales7;
    }

    public String getMateriales8() {
        return materiales8;
    }

    public void setMateriales8(String materiales8) {
        this.materiales8 = materiales8;
    }

    public String getServicio1() {
        return servicio1;
    }

    public void setServicio1(String servicio1) {
        this.servicio1 = servicio1;
    }

    public String getServicio2() {
        return servicio2;
    }

    public void setServicio2(String servicio2) {
        this.servicio2 = servicio2;
    }

    public String getInfraestructura1() {
        return infraestructura1;
    }

    public void setInfraestructura1(String infraestructura1) {
        this.infraestructura1 = infraestructura1;
    }

    public String getInfraestructura2() {
        return infraestructura2;
    }

    public void setInfraestructura2(String infraestructura2) {
        this.infraestructura2 = infraestructura2;
    }

    public String getInfraestructura3() {
        return infraestructura3;
    }

    public void setInfraestructura3(String infraestructura3) {
        this.infraestructura3 = infraestructura3;
    }

    public String getInfraestructura4() {
        return infraestructura4;
    }

    public void setInfraestructura4(String infraestructura4) {
        this.infraestructura4 = infraestructura4;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Material(){

    }
}

