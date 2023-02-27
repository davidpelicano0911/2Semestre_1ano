package aula02;
import java.util.Scanner;
import utils.UserInput;

public class Ex03 {
    public static void main(String[] args){
        double ti,tf,M;
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperatura inicial em graus Celsius(C): ");
        ti = sc.nextDouble();
        System.out.println("Temperatura final em graus Celsius(C): ");
        tf = sc.nextDouble();
        System.out.print("Quantidade da água em kg: ");
        M = UserInput.positivo(sc);
        //System.out.println(ti);
        sc.close();
        double Q = M*(tf-ti)*4184;
        System.out.println("A energia Q é de "+Q + " joules.");
    }
}

