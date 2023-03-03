package aula03.P;

import utils.UserInput;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Montante Investido: ");
        double montante = UserInput.positivo(sc); 
        while (true){
            if (montante % 1000 == 0){
                System.out.println(montante);
                break;
            }else{
                System.out.print("Montante Investido: ");
                montante = UserInput.positivo(sc);
            }
        }
        

        System.out.print("Taxa de juro mensal entre 0% e 5%: ");
        double taxa = UserInput.readDouble(0, 5,sc);
        
            
        System.out.println(taxa);
        sc.close();
        
        double fundo = montante + (montante * (taxa/100));
        for (int i = 1;i<=12;i++){
            System.out.printf("Fundo do %2d mês: %.2f \n",i,fundo);
            fundo += fundo * (taxa/100);
        }

    }
}
