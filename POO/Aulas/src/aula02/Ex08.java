package aula02;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args){
        double cA,cB;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Cateto A: ");
            cA = sc.nextDouble();
            System.out.println("Cateto B: ");
            cB = sc.nextDouble();
        } while (cA<=0 || cB <=0);
        double hip = Math.sqrt(Math.pow(cA,2)+Math.pow(cB,2));
        double angulo = Math.toDegrees(Math.asin(cB/hip));
        System.out.printf("A hipotenusa é de %.1f e o ângulo entre o lado A e a hipotenusa: %.3f graus. \n",hip,angulo);

        sc.close();
    }
}
