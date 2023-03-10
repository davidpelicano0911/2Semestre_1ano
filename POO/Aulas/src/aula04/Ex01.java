//package aula04;
import java.util.Scanner;

public class Ex01 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int escolha = 1;
        while(true){
            System.out.print("\n");
            System.out.print("1) Círculo \n");
            System.out.print("2) Triângulo \n");
            System.out.print("3) Retângulo \n");
            System.out.print("4) Terminar o programa. \n");
            System.out.print("Escolha: ");
            escolha = sc.nextInt();
            if (escolha == 1){
                Ex01 circle = new Ex01();
                circle.Circle();
            }

            if (escolha == 4){
                break;
            }

            if (escolha < 1 || escolha > 4){
                System.out.print("Essa opção não existe no menu.");
            }
        }
            
        


    }

    private void Circle(){
        System.out.print("\n");
        System.out.print("Raio do círculo: ");
        double raio1 = sc.nextDouble();
        Circle c1 = new Circle(raio1);
        System.out.print("Raio para um segundo círculo: ");
        double raio2 = sc.nextDouble();
        Circle c2 = new Circle(raio2);
        c1.toString();
        System.out.print(c1);

        
        if(c1.equals(c2)){
            System.out.print("Os círculos c1 e c2 têm o mesmo raio, logo são iguais \n");
        } else{
            System.out.print("Os círculos c1 e c2 não são iguais. \n");
        }
    }
}
