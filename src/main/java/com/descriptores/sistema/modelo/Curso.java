package com.descriptores.sistema.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cursoId;
    private String titulo;
    private String area;
    private String dirigido;
    private String nivel;

    private String objetivos;

    private String especializacion;
    private String descripcion;
    private String condicion1;
    private String condicion2;
    private String condicion3;
    private String condicion4;
    private String year;
    private String duracion;
    private String prerequisitos;
    private String metodologia;
    private String participantes;
    private boolean activo = false;

    @ManyToOne(fetch = FetchType.EAGER)
    private Categoria categoria;

    @OneToMany(mappedBy = "curso",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore

    private Set<Tema> temas = new HashSet<>();

    @OneToMany(mappedBy = "curso",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Material> materiales = new HashSet<>();


    public Set<Material> getMateriales() {
        return materiales;
    }

    public void setMateriales(Set<Material> materiales) {
        this.materiales = materiales;
    }

    public Long getCursoId() {
        return cursoId;
    }

    public void setCursoId(Long cursoId) {
        this.cursoId = cursoId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDirigido() {
        return dirigido;
    }

    public void setDirigido(String dirigido) {
        this.dirigido = dirigido;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCondicion1() {
        return condicion1;
    }

    public void setCondicion1(String condicion1) {
        this.condicion1 = condicion1;
    }

    public String getCondicion2() {
        return condicion2;
    }

    public void setCondicion2(String condicion2) {
        this.condicion2 = condicion2;
    }

    public String getCondicion3() {
        return condicion3;
    }

    public void setCondicion3(String condicion3) {
        this.condicion3 = condicion3;
    }

    public String getCondicion4() {
        return condicion4;
    }

    public void setCondicion4(String condicion4) {
        this.condicion4 = condicion4;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getPrerequisitos() {
        return prerequisitos;
    }

    public void setPrerequisitos(String prerequisitos) {
        this.prerequisitos = prerequisitos;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    public String getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Set<Tema> getTemas() {
        return temas;
    }

    public void setTemas(Set<Tema> temas) {
        this.temas = temas;
    }


}
