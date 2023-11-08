public class principal{

    public static void main(String[] args){
        System.out.println("Hello World");    
        String person1 = "Lucas";
        String person2 = "figueredo";
        String firstC = texts.conc(person1, person2);
        System.out.println("The result of adding ( " + person1 + " ) and ( " + person2 + " ) is " + firstC);
    
        String inputTestOne = texts.input();
        String secondC = texts.conc(firstC, inputTestOne);

        System.out.println("The input was: (" + inputTestOne + 
         " ) and the result of adding some of the strings is: ( " + secondC + ")" );
        
        String keyClient = texts.input();

        texts.testWhile(keyClient);
    
    
    
    
    
    
    
    
    }



}



