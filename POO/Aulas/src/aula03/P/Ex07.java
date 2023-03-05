package aula03.P;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Frase: ");
        String frase = sc.nextLine();
        int digitos = CountDigits(frase);
        System.out.printf("A frase contém %d digitos. \n",digitos);
        int espacos = QuantosEspacos(frase);
        System.out.printf("A frase contém %d espaços. \n",espacos);
        boolean maiusculas = ContemMaiusculas(frase);
        if (maiusculas){
            System.out.print("Contém maiúsculas. \n");
        } else{
            System.out.print("SÓ CONTÉM MINUSCULAS \n");
        }
        String apenasUmEspaco = SubstituirEspacos(frase);
        System.out.printf("Frase com apenas um espaço nos espaços colocados: %s \n",apenasUmEspaco);

        boolean palindromo = palindromo(frase);
        if (palindromo){
            System.out.printf("É palíndromo.");
        }else{
            System.out.printf("Não é palíndromo.");
        }
        
    }   

    public static int CountDigits(String s){
        int count = 0;
        for (int i = 0; i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                count ++;
            }
        }
        return count;
    }

    public static int QuantosEspacos(String s){
        int count = 0;
        for (int i = 0; i<s.length();i++){
            if(s.charAt(i) == ' '){
                count ++;
            }
        }
        return count;
    }

    public static boolean ContemMaiusculas(String s){
        for (int i = 0;i<s.length();i++){
            if (Character.isUpperCase(s.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static String SubstituirEspacos(String s){
        return s.replaceAll("\\s+", " ");
    }

    public static boolean palindromo(String s){
        s = s.replaceAll(" ", "").toLowerCase();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
