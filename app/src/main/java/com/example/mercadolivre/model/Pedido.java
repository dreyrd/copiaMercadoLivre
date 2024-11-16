package com.example.mercadolivre.model;

public class Pedido {

    private String data;
    private String status;
    private String previsao;
    private String nomeProduto; // Novo campo para o nome do produto
    private int imagemProduto;

    public Pedido(String data, String status, String previsao, int imagemProduto, String nomeProduto) {
        this.data = data;
        this.status = status;
        this.previsao = previsao;
        this.imagemProduto = imagemProduto;
        this.nomeProduto = nomeProduto;
    }

    public String getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }

    public String getPrevisao() {
        return previsao;
    }

    public int getImagemProduto() {
        return imagemProduto;
    }

    public String getNomeProduto() { // Novo getter para nome do produto
        return nomeProduto;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPrevisao(String previsao) {
        this.previsao = previsao;
    }

    public void setImagemProduto(int imagemProduto) {
        this.imagemProduto = imagemProduto;
    }

    public void setNomeProduto(String nomeProduto) { // Novo setter para nome do produto
        this.nomeProduto = nomeProduto;
    }
}
