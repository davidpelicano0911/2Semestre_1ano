package aula03.P;
import java.util.Scanner;


public class Ex08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza uma frase:");
        String frase = sc.nextLine();
        frase = frase.replaceAll("\\s+"," ");
        //System.out.print(frase + "\n");
        String[] lista = frase.split(" ");

        String acronimo = "";
        
        //System.out.print(lista[0]);
        for (String palavra : lista){
            //System.out.print(palavra);
            if (palavra.length() >= 3){
                acronimo += palavra.substring(0, 1).toUpperCase();
            }

        }
        System.out.printf("Acrónimo: %s \n ", acronimo);

        sc.close();
    }
}
