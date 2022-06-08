/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;



/**
 *
 * @author Gustavo Caramasqui
 */
public class Produto {
     private String id;
    private String nome;
    private Integer quantidade;
    private Float custo;
    private Float valor;

    public Produto(String id, String nome, Integer quantidade, Float custo, Float valor) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.custo = custo;
        this.valor = valor;
    }  

   public String getId() {
        return id;
    }

    public void setId(String Id) {
        this.id = Id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Float getCusto() {
        return custo;
    }

    public void setCusto(Float Custo) {
        this.custo = Custo;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float Valor) {
        this.valor = Valor;
    }

    
    
}
