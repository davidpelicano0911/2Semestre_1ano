package aula03.P;
import java.util.Scanner;
import java.util.Random;

public class Ex03 {
    public static void main(String[] args){

        String resposta;
        do{
            Scanner sc = new Scanner(System.in);
            altoBaixo();
            System.out.print("Pretende continuar? Prima (S)im ");
            resposta = sc.next();

        } while (resposta.equals("S") || resposta.equals("Sim") || resposta.equals("s"));

        
    }

    private static void altoBaixo(){
        Scanner sc = new Scanner(System.in);
        int tentativas = 0;
        Random random = new Random();
        int rand = random.nextInt(100) + 1;
        int n = -1;
        do {
            //System.out.println(rand);
            System.out.print("Número: ");
            n = sc.nextInt();
            if (n < rand){
                System.out.print("Valor baixo. ");
            }
            if (n > rand){
                System.out.print("Valor alto. ");
            }
            tentativas ++;
        } while (n != rand);
        

        System.out.printf("Foram feitas %d tentativas. \n",tentativas);
    }
}
