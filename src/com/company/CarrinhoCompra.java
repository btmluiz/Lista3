package com.company;

public class CarrinhoCompra {
    private int qtdItensCarrinho;
    private Item[] itens;

    CarrinhoCompra(){
        qtdItensCarrinho = 0;
        itens = new Item[200];
    }

    public int getQtdItensCarrinho(){
        return this.qtdItensCarrinho;
    }

    public void adicionar(Produto produto, int qtdItens){
        for (int i = 0; i < this.qtdItensCarrinho; i++){
            if (this.itens[i].getProduto().equals(produto)){
                if(this.itens[i].getProduto().getQtdEstoque() > 0) {
                    this.itens[i] = new Item(produto, itens[i].getQtdNoCarrinho() + qtdItens);
                }
                return;
            }
        }
        this.itens[this.qtdItensCarrinho] = new Item(produto, qtdItens);
        this.itens[this.qtdItensCarrinho].getProduto().setQtdEstoque(this.itens[this.qtdItensCarrinho].getProduto().getQtdEstoque()-qtdItens);
        this.qtdItensCarrinho++;
    }

    public void remover(Produto produto, int qtdItens){
        for (int i = 0; i < qtdItensCarrinho; i++){
            if(this.itens[i].getProduto().equals(produto)){
                this.itens[i].getProduto().setQtdEstoque(this.itens[i].getProduto().getQtdEstoque()+qtdItens);
                if (this.itens[i].getQtdNoCarrinho() <= 0) {
                    this.itens = null;
                    this.qtdItensCarrinho--;
                }
                break;
            }
        }
    }
}
