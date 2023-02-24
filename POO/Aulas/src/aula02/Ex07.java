package aula02;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args){
        int x1,x2,y1,y2;
        Scanner sc = new Scanner(System.in);
        System.out.println("x1: ");
        x1 = sc.nextInt();
        System.out.println("y1: ");
        y1 = sc.nextInt();
        System.out.println("x2: ");
        x2 = sc.nextInt();
        System.out.println("y2: ");
        y2 = sc.nextInt();
        double d = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        sc.close();

        System.out.println("A distância entre os pontos é de "+ d);
    }
}
