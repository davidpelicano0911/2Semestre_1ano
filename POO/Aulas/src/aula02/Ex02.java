package aula02;
import java.util.Scanner;
import utils.UserInput;

public class Ex02 {
    public static void main(String[] args){
        double fahrenheit,celsius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperatura em graus Celsius: ");
        celsius = UserInput.positivoN();
        fahrenheit = (1.8*celsius) + 32;
        System.out.println(celsius+" graus celsius(C) são "+fahrenheit+" graus Fahrenheit (F)");

        sc.close();
    }
}