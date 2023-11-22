package atividade_5;

public class pessoa {
    String nome;
    pessoa proxima;


    public pessoa(String nome) {
        this.nome = nome;
        this.proxima = null;
    }

    public String getNome() {
        return this.nome;
    }

    public pessoa getProxima() {
        return this.proxima;
    }

    public void setProxima(pessoa proximo) {
        this.proxima = proximo;
    }



}
