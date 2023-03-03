package aula03.P;
import utils.UserInput;
import java.util.Scanner;

public class Ex01 {
    //Escreva um programa que leia do teclado um número inteiro positivo e devolva a soma de
    //todos os números primos até esse valor (inclusive)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor: ");
        double n = UserInput.positivo(sc);
        int soma = 0;
        int count = 0;

        for (int i = 1; i<=n; i++){
            if (UserInput.isPrime(i)){
                count ++;
                soma += i;
            }
        }

        

        System.out.printf("Temos %d valores primos e a soma destes será %d ",count,soma);

    }
}
