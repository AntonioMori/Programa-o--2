import java.util.Scanner;

public class texts {
    

    //conc == concatenate
    public static String conc(String texto1, String texto2){
        return texto1+ " " +texto2;
    }

    public static String input() {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Digite algo: "); 
        String entrada = scanner.nextLine(); 
        return entrada;
    }

    public static String testWhile(String keyTest){
        
                    // hello world == password
        while(!keyTest.equals("hello world")) { 

            System.out.println("You didn't type the correct passaword, please try again\n");
            keyTest = input();

        }

        System.out.println("You typed the correct passaword, welcome to the system\n");
        
        return keyTest;

    
    };








} 


