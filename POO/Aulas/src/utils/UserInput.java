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

    public static boolean isPrime(double n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i<= Math.sqrt(n);i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double readDouble(double min,double max,Scanner sc){
        double valor;
        while (true){
            valor = sc.nextDouble();
            if (valor <= max && valor >= min){
                break;
            }
            System.out.println("O valor tem de estar dentro do intervalo referido.");
        }
        return valor;
        
    }

    public static double positivo(Scanner sc){
        double num;
        while (true){
            num = sc.nextDouble();
            if (num > 0){
                break;
            }
            System.out.print("O valor tem der ser positivo: ");
        }
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