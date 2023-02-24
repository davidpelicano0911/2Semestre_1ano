package utils;
import java.util.Scanner;

public class UserInput {
    public static int readInt(int min,int max){
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        
        while (valor < min || valor > max){
            valor = sc.nextInt();
        }
        sc.close();
        return valor;
        
    }

    public static double readDouble(double min,double max){
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        
        while (valor < min || valor > max){
            valor = sc.nextDouble();
        }
        sc.close();
        return valor;
        
    }

    public static double positivo(String frase){
        Scanner sc = new Scanner(System.in);
        double num;
        while (true) {
            System.out.print(frase);
            num = sc.nextDouble();
            if (num > 0) {
                break;
            } else {
                System.out.println("O valor tem de ser positivo. ");
            }
        }
            sc.close();
            return num;
        }
    
    public static double positivoN(){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        while (true){
            if (n > 0){
                break;
            }else{
                System.out.print("O valor tem de ser positivo! \n");
                n = sc.nextDouble();
            }
        }
        sc.close();
        return n;
    }

    public static int positivoN_inteiros(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (true){
            if (n > 0){
                break;
            }else{
                System.out.print("O valor tem de ser positivo! \n");
                n = sc.nextInt();
            }
        }
        sc.close();
        return n;
    }

    

    }