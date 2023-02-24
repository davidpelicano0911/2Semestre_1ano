package aula02;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        double n = sc.nextDouble();

        int total = 1;
        double min = n;
        double max = n;
        double soma = n;

        while (true){
            System.out.println("Número: ");
            double N = sc.nextDouble();
            if (N == max){
                break;
            }
            soma += N;
            total ++;
            if (N > max){
                max = N;
            }
            if (N < min){
                min = N;
            }
        }
        double media = soma/total;
        sc.close();
        System.out.printf("Valor mínimo: %.2f, Valor máximo: %.2f, Média: %.2f, Total de números lidos: %d",min,max,media,total);


    }
}
