package com.company;

public class Produto {
    private int id, qtdEstoque;
    private String descricao;
    private double precoUni;

    Produto(){
        this.id = 0;
        this.qtdEstoque = 0;
        this.descricao = "";
        this.precoUni = 0.;
    }

    Produto(int id, int qtdEstoque, String descricao, double precoUni){
        this.id = id;
        this.qtdEstoque = qtdEstoque;
        this.descricao = descricao;
        this.precoUni =  precoUni;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setQtdEstoque(int qtdEstoque){
        this.qtdEstoque = qtdEstoque;
    }

    public int getQtdEstoque(){
        return this.qtdEstoque;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setPrecoUni(double precoUni) {
        this.precoUni = precoUni;
    }

    public double getPrecoUni() {
        return precoUni;
    }
}
