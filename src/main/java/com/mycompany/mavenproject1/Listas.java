/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author Gustavo Caramasqui
 */
public class Listas {
    public ArrayList<Atendente> usuarios = new ArrayList();
    
    public void cadastroUsuario(Atendente atendente){
    usuarios.add(atendente);    
    }
    public void excluirUsuario(Atendente atendente){
    usuarios.remove(atendente);
    }
    public ArrayList<Atendente> getUsuarios(){
    return usuarios;
    
    }
    
     ArrayList<Produto> produtos = new ArrayList();
    
    public void cadastroProduto(Produto produto){
    produtos.add(produto);    
    }
    public void excluirProduto(Produto produto){
    produtos.remove(produto);
    }
    public ArrayList<Produto> getProdutos(){
    return produtos;
    
    }
    
}
