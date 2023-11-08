package atividade4;

public class pessoa {
    String nome;
    int idade;

    public pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimir(){
        System.out.println("Nome: "+this.nome + "\nIdade: "+this.idade);
    }
    
}
