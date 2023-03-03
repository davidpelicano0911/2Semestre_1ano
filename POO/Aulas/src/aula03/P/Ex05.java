package aula03.P;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String input = "";
        
        do{
            System.out.print("Data no formato: mm/yyyy: ");
            input = sc.next();
        } while(input.length()!=7);
        String[] partes = input.split("/");
        //System.out.print(partes[0]);
        int mes = Integer.parseInt(partes[0]);
        int ano = Integer.parseInt(partes[1]);
        

        //System.out.print(monthDays(mes,ano)+"\n");

        
        System.out.print("Dia da semana que começa esse mês: \n (1 = Segunda, 2 = Terça, 3 = Quarta, 4 = Quinta,5 = Sexta, 6 = Sábado, 7 = Domingo) \n");
        String primeiroDia = sc.next();
        int firstDay = Integer.parseInt(primeiroDia);

        String[] meses = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        System.out.printf("%10s %d \n",meses[mes-1],ano);
        System.out.printf("%1s %1s %1s %1s %1s %1s %1s \n","Su","Mo","Tu","We","Th","Fr","Sa");

        //System.out.print(mesAno(mes, ano));
        int count = 0;
        if (firstDay != 7){
            for(int i =0;i<firstDay;i++){
                System.out.printf("%2s ", " ");
                count ++;
            }
        }
        
        //System.out.print(count);
        
        for (int i = 1; i<=monthDays(mes, ano);i++){
            System.out.printf("%2d ",i);
            count ++;
            if (count == 7){
                System.out.print("\n");
                count = 0;
            }
        }
    }   
    
    private static int monthDays(int mes,int ano){
        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            
            case 2:
                if (anoBissexto(ano)){
                    return 29;
                }else{
                    return 28;
                }
                
        }
        return 0;
    }

    private static boolean anoBissexto(int ano) {
        if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    
    
}
