package com.venilson.craque_das_letras.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Jogador {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String nomeSemEspacos;
    private String nomeExibicao;
    private String posicao;
    
    public Jogador() {
    }

    public Jogador(Long id, String nomeSemEspacos, String nomeExibicao, String posicao) {
        this.id = id;
        this.nomeSemEspacos = nomeSemEspacos;
        this.nomeExibicao = nomeExibicao;
        this.posicao = posicao;
    }

    public Long getId() {
        return id;
    }

    public String getNomeSemEspacos() {
        return nomeSemEspacos;
    }

    public void setNomeSemEspacos(String nomeSemEspacos) {
        this.nomeSemEspacos = nomeSemEspacos;
    }

    public String getNomeExibicao() {
        return nomeExibicao;
    }

    public void setNomeExibicao(String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    
}
