import java.util.Scanner;

public class texts {
    


    public static String conc(String texto1, String texto2){
        return texto1+ " " +texto2;
    }

    public static String input() {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada padrão
        System.out.print("Digite algo: "); // Exibe uma mensagem para o usuário
        String entrada = scanner.nextLine(); // Lê a entrada do usuário como uma linha de texto
        return entrada;
    }

    public static String testWhile(String keyTest){
        
        
        while(keyTest != "hello world"){ 

            System.out.println("You didn't type the correct passaword, please try again\n");
            keyTest = input();

        }
        return keyTest;


    };








}


