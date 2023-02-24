package aula02;
import utils.UserInput;

public class Ex11 {
    public static void main(String[] args){
        
        System.out.print("Escreva um número de 1 a 10: ");
        int n = UserInput.readInt(1,10);
        System.out.print(n+ "\n");
    }
}
