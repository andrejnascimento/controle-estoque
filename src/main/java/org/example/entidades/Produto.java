package org.example.entidades;

public class Produto {

    private int codigo;
    private String nome;
    private int estoque;

    public Produto(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }

    //metodos

    public void incluirEstoque(int quantidade){
        estoque = estoque + quantidade;
    }

    public void tirarEstoque(int quantidade){


        if(estoque >= quantidade) {
            estoque = estoque - quantidade;
        } else
            System.out.printf("Quantidade indisponível. Digite um valor até %d", this.estoque);

    }

    public void consultarEstoque(){
        System.out.println(estoque);
    }

}
