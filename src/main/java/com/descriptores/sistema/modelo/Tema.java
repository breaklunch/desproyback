package com.descriptores.sistema.modelo;

import javax.persistence.*;

@Entity
@Table(name = "temas")
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long temaId;
    private String nombre;
    private String modalidad;
    private String contenido;
    private String subtema1;
    private String subtema2;
    private String subtema3;
    private String subtema4;
    @ManyToOne(fetch = FetchType.EAGER)
    private Curso curso;

    public Long getTemaId() {
        return temaId;
    }

    public void setTemaId(Long temaId) {
        this.temaId = temaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getSubtema1() {
        return subtema1;
    }

    public void setSubtema1(String subtema1) {
        this.subtema1 = subtema1;
    }

    public String getSubtema2() {
        return subtema2;
    }

    public void setSubtema2(String subtema2) {
        this.subtema2 = subtema2;
    }

    public String getSubtema3() {
        return subtema3;
    }

    public void setSubtema3(String subtema3) {
        this.subtema3 = subtema3;
    }

    public String getSubtema4() {
        return subtema4;
    }

    public void setSubtema4(String subtema4) {
        this.subtema4 = subtema4;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Tema(){

    }
}
