package com.springchalenges.modeloDeDominioORM.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_atividade")
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String descricao;

    private String preco;

    public Atividade() {}

    public Atividade(Long id, String name, String descricao, String preco) {
        this.id = id;
        this.name = name;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
