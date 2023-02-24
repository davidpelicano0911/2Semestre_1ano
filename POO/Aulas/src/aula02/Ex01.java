package aula02;
import utils.UserInput;

public class Ex01 {
    public static void main(String[] args){
        double distancia = UserInput.positivo("Distância em kms: ");
        double milhas = distancia / 1.609;
        System.out.printf("A distância de %.2f kms é de %.2f milhas. \n",distancia,milhas);
        
    }
}