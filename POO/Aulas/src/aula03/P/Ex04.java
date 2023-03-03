package aula03.P;
import java.util.Scanner;
import java.util.Random;

public class Ex04 {
    public static void main(String[] args){
        int alunos;
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de alunos: ");
        alunos = sc.nextInt();

        Random random = new Random();
        
        System.out.printf("%-5s  %-5s  %-5s \n","NotaP","NotaP","Pauta");
        for (int i=1;i<=alunos;i++){
            int pauta;
            double np = random.nextDouble()*20.0;
            double nt = random.nextDouble()*20.0;
            if (np < 7.0 || nt < 7.0){
                pauta = 66;
            } else{
                pauta = (int) ((0.4*nt) + (0.6*np));
            }
            System.out.printf("%5.1f  %5.1f  %5d \n",np,nt,pauta);

        }
    }
    
}
