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

        if(estoque < quantidade) {
            System.out.printf("Quantidade indisponível. Digite um valor até %d", quantidade);
        } else
            estoque = estoque - quantidade;
    }

    public void consultarEstoque(){
        System.out.println(estoque);
    }

}
