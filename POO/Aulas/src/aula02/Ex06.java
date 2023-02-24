package aula02;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args){
        int segundos,horas,minutos;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Segundos: ");
            segundos = sc.nextInt();
        }while (segundos<=0);

        horas = (segundos/3600);
        minutos = (segundos%3600)/60;
        segundos = segundos % 60;
        System.out.printf("%d:%d:%d \n",horas,segundos,minutos);

        sc.close();
    }
}
