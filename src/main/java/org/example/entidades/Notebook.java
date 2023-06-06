package org.example.entidades;

public class Notebook extends Produto{

    private String fabricante;
    private String modelo;
    private String serial;

    public Notebook(int codigo, String nome, String serial) {
        super(codigo, nome);
        this.serial = serial;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
