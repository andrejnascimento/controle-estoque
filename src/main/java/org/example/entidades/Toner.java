package org.example.entidades;

public class Toner extends Produto{

    private String modelo;
    private String cor;
    private String tipo;

    public Toner(int codigo, String nome, String modelo, String cor, String tipo) {
        super(codigo, nome);
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

