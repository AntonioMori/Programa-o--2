package atividade_5;

public class principal {

    public static void main(String[] args){
        System.out.println("Adiçao de 5 pessoas\n");


        listaLigada e = new listaLigada();
        e.insereInicio("1ª Antonio ");
        e.insereFim("2ª Pessoa ");
        e.insereFim("3ª Pessoa ");
        e.insereFim("4ª Pessoa ");
        e.insereFim("5ª Pessoa ");
        e.imprimir();

        
        System.out.println("\n\nTeste arvore genealógica");
        pessoaGenealogica antonio = new pessoaGenealogica("Antonio");
        pessoaGenealogica ana = new pessoaGenealogica("Ana Lucia Camargo");
        pessoaGenealogica mirian = new pessoaGenealogica("Mirian Nanci Camargo");
        pessoaGenealogica marido = new pessoaGenealogica("Marido de Mirian Nanci");

        pessoaGenealogica ale = new pessoaGenealogica("Alessandro Mori");
        pessoaGenealogica paulo = new pessoaGenealogica("Paulo Mori");
        pessoaGenealogica giovanna = new pessoaGenealogica("Giovanna Mori");


        antonio.setMae(ana);
        antonio.mae.setPai(marido);
        antonio.mae.setMae(mirian);

        antonio.setPai(ale);
        antonio.pai.setPai(paulo);
        antonio.pai.setMae(giovanna);
        
        antonio.imprimirArvore();

    }
    
}
