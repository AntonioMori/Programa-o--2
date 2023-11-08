public class Principal {

    public static void main(String[] args) {
        produto calculadora = new produto("calculadora", 2, 100);
        calculadora.getNome();
        calculadora.getPreco();
        calculadora.setQuantidade(10);
        double valorTotal = calculadora.valorTotalEstoque();
        System.out.println(valorTotal);
    }
    
}
