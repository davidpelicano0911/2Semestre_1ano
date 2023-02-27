package aula02;
import utils.UserInput;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Distância: ");
        double distancia = UserInput.positivo(sc);
        double milhas = distancia / 1.609;
        System.out.printf("A distância de %.2f kms é de %.2f milhas. \n",distancia,milhas);
        
    }
}