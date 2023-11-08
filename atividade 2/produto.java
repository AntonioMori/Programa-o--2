public class produto {
    String nome;
    double preco;
    int quantidade;
    

    public produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public void getNome() {
        System.out.println(this.nome);
    }   

    public void getPreco() {
        System.out.println(this.preco);
    }

    public void getQuantidade(){
        System.out.println(this.quantidade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }   

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public double valorTotalEstoque(){
        return this.preco * this.quantidade;
    }


}
