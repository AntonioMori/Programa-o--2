package atividade4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class principal {
    public static void main(String[] args) {
 
        System.out.println("Questão 1.\nTabuada do nove\n");
        int[] array_teste = new int[10];

        for(int i = 1; i<=array_teste.length; i++){
           
            array_teste[i-1] = 9 * i;
            System.out.println(array_teste[i-1]);
        }

        System.out.println("\nQuestão 2.\nBase=2, expoentes i= 1 a 20\n");

        float[] array_float = new float[20];        
        int resultado= 1;

        for(int i = 1; i<=array_float.length; i++){
            resultado *=2;
            
            System.out.println("i= " +i+" , Resultado = "+resultado);
        }
    
        System.out.println("\nQuestão 3.\nArray de Strings\n");

        String[] array_nomes = {"Giovanna Vilela","Antonio Mori", "Joao Pedro", "Lucas","Felipe Patriota"}; 
        
        array_nomes[3] = "Maria";

        for(int i = 0; i<array_nomes.length;i++){
            System.out.println((i+1) +". - "+array_nomes[i]);
        }
        

        System.out.println("\nQuestão 4.\nArrayList, 4 nome deve ser 'Mario'\n");

        ArrayList<String> arrayListNomes = new ArrayList<>();

        List<String> nomes = Arrays.asList("Giovanna Vilela", "Antonio Mori", "João Pedro", "Lucas", "Felipe Patriota");

        arrayListNomes.addAll(nomes);
        arrayListNomes.set(3,"Mario");

        for(int i=0; i < arrayListNomes.size();i++){
            System.out.println((i+1)+". - "+ arrayListNomes.get(i));
        }



        System.out.println("\nQuestão 5.\nClasse pessoa, arrayPessoas\n");

        pessoa[] arrayPessoas = {new pessoa("Giovanna Vilela", 21), new pessoa("Antonio Mori", 20), new pessoa("Felipe Patriota", 25)};
        
        for (int i = 0; i < arrayPessoas.length; i++) {
            arrayPessoas[i].imprimir();
        }



        System.out.println("\nQuestão 6.\nClasse pessoa, arrayList de pessoas\n");
        
        ArrayList<pessoa> arrayListPessoas = new ArrayList<>();

        List<pessoa> pessoasList = Arrays.asList(new pessoa("Lucas", 54),new pessoa("Gustavo", 15), new pessoa("Bárbara",21));
        
        arrayListPessoas.addAll(pessoasList);
        for(int i = 0; i<arrayListPessoas.size();i++){
            arrayListPessoas.get(i).imprimir();

        }

        System.out.println("\nQuestão 7.\nMinimapa de jogo\n");
    }
}
