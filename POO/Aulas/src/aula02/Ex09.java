package aula02;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("N: ");
        N = sc.nextInt();
        for (int i = N;i>=0;i--){
            if (i%10==0){
                System.out.print(i + "\n");
            }else{
                System.out.print(i+", ");
            }
        }
        sc.close();
        // contagem decrescente até 0 a partir de N
    }
}
