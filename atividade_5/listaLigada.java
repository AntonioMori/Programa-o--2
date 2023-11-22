package atividade_5;

class listaLigada {

    private pessoa cabeca;

    public listaLigada() {
        cabeca = null;
    }

    public void insereInicio(String nome) {
        if(this.cabeca == null){ // se a cabeça apontar para null então
            this.cabeca = new pessoa(nome); //cria um nó, agora cabeça aponta para esse nó que o proximo é null
        }
        else{
            pessoa n = new pessoa(nome); //como a cabeça já aponta para um nó, cria um novo nó com o valor desejado
            n.setProxima(cabeca); // agora o nó vai apontar para onde a cabeça inicialmente estava apontando , (do qual o proximo e null portanto ele vai ser o ultimo)
            this.cabeca = n;  //o apontamento da cabeça agora vai ser o novo nó criado, então temos a cabeça apontando para n, que aponta para outro nó que aponta para null
 
        }
    }

    public void imprimir(){
        pessoa atual = cabeca;
        while (atual!=null) {
            System.out.println(atual.getNome());
            atual = atual.getProxima();
            
        }
    }

    public void insereFim(String nome) {
        pessoa novaPessoa = new pessoa(nome); // Cria o novo nó com o valor fornecido

        if (this.cabeca == null) {
            // Se a lista estiver vazia, o novo nó se torna a cabeça da lista
            this.cabeca = novaPessoa;
        } else {
            pessoa atual = cabeca;

            // Percorre a lista até encontrar o último nó
            while (atual.getProxima() != null) {
                atual = atual.getProxima();
            }

            // Define o próximo do último nó como o novo nó
            atual.setProxima(novaPessoa);
        }
    }
}