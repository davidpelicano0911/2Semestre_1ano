package aula02;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        //valores têm de ser positivos
        Scanner sc = new Scanner(System.in);
        double v1,d1,v2,d2,t1,t2,tf,dt,vm;
        do{
            System.out.println("V1:");
            v1 = sc.nextDouble();
        } while (v1<=0);

        do{
            System.out.println("D1:");
            d1 = sc.nextDouble();
        } while (d1<=0);

        do{
            System.out.println("V2:");
            v2 = sc.nextDouble();
        } while (v2<=0);

        do{
            System.out.println("D2:");
            d2 = sc.nextDouble();
        } while (d2<=0);
        

        
        
            
        dt = d1 + d2;
        t1 = d1/v1;
        t2 = d2/v2;
        tf = t1+t2;
        vm = dt/tf;
        sc.close();

        System.out.printf("A velocidade média será de %.2f .",vm);

    }
}
