package aula02;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        double mont_inv,taxa_mensal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Montante Investido: ");
        mont_inv = sc.nextDouble();
        System.out.println("Taxa de juro mensal: ");
        taxa_mensal = sc.nextDouble();

        double a = 0;
        for (int i = 1; i<=3; i++){
            a = mont_inv * taxa_mensal/100;
            //System.out.println(a);
            mont_inv += a;
            //System.out.println(mont_inv);
        }
        sc.close();
        System.out.println("O valor total ao final de 3 meses será de "+mont_inv+ " euros. ");
    }
}
