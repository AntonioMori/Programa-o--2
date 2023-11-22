package atividade_5;

public class pessoaGenealogica {
    String nome;
    pessoaGenealogica mae;
    pessoaGenealogica pai;
    
    public pessoaGenealogica(String nome){
        this.pai = null;
        this.mae = null;
        this.nome = nome;
    }

    public void setPai(pessoaGenealogica pai){
        this.pai = pai;
    }

    public void setMae(pessoaGenealogica mae){
        this.mae = mae;
    }

    public String getNome(){
        return this.nome;
    }

    public pessoaGenealogica getMae(){
        return this.mae;
    }   

    public pessoaGenealogica getPai(){
        return this.pai;
    }

    public void imprimirArvore(){
        int condicao = 0;
        
        while (condicao ==0 ) {
            if (pai!=null && mae !=null) {

                System.out.println("\nO pai e mae da pessoa:"+ this.nome +" são : ");
                
                pessoaGenealogica pai = getPai(); //pega o pai da pessoa
                String nomePai = pai.getNome();
                pessoaGenealogica mae = getMae(); //pega a mae da pessoa
                String nomeMae = mae.getNome();
    
                System.out.println("Mae: "+nomeMae+"\nPai: "+nomePai); //imprime o pai e a mae
                
                
                pai.imprimirArvore();
                mae.imprimirArvore();
            } 
            condicao = 1;
            
        }
    }



}
