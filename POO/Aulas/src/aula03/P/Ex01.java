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
        double inicial = n;
        int soma = 0;
        int count = 0;
        if (UserInput.isPrime(n)){
            //System.out.println("primeiro valor é primo");
            count ++;
            soma += n;
        }
        //System.out.println(soma);
        while (true) {
            System.out.print("Valor: ");
            double valor = UserInput.positivo(sc);
            if (valor == inicial){
                if (UserInput.isPrime(valor)){
                    soma += valor;
                    count ++;
                }
                break;
            }
            if (UserInput.isPrime(valor)) {
                soma += valor;
                count ++;
            }
            
        }

        System.out.printf("Temos %d valores primos e a soma destes será %d ",count,soma);

    }
}
