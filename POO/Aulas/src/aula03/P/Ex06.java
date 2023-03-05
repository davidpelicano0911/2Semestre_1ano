package aula03.P;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Frase: ");
        String frase = sc.nextLine();
        System.out.printf("Frase em minusculas : %s \n",frase.toLowerCase());
        char lastChar = frase.charAt(frase.length()-1);
        System.out.printf("Último carácter da frase: %s \n",lastChar);
        String tresPrimeiros = frase.substring(0, 3);
        System.out.printf("Os primos 3 caraters: %s \n",tresPrimeiros);
        System.out.printf("Espaços removidos do inicio e do fim: %s \n",frase.trim());
        
        String[] lista = frase.split(" ");
        if (lista.length > 0) {
            String ultimoElemento = lista[lista.length - 1];
            System.out.printf("Última palavra da frase: %s \n", ultimoElemento);
        } else {
            System.out.println("A frase não contém espaços em branco.");
        }

        boolean comecaComA = frase.startsWith("A");
        String novaFrase = frase.replace("A","b");
        boolean contemA = frase.contains("B");

        if (comecaComA && contemA){
            System.out.print("Começa com A e contém B \n");
        }



        sc.close();
    }
}
