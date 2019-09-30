package com.company;

public class Item {
    private Produto produto;
    private int qtdNoCarrinho;

    Item(Produto produto, int qtdNoCarrinho){
        this.produto = produto;
        this.qtdNoCarrinho = qtdNoCarrinho;
    }

    public Produto getProduto(){
        return this.produto;
    }

    public int getQtdNoCarrinho(){
        return this.qtdNoCarrinho;
    }

    public double calculaPreco(){
        return (this.produto.getPrecoUni() * this.qtdNoCarrinho);
    }
}
