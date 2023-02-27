package POO;
import java.util.ArrayList;


public class test {

    
    public static void main(String[] args){


        //primitives variables
        int myInt = 7;
        double shoeSize = 40.5;
        char myInitial = 'D'; // aqui só uma ''

        double result = myInt * shoeSize;

        //acho que a String já n é primitive
        String myName = "David"; // aqui duas aspas ""

        printName("David",18);

        String[] lista = new String[3];
        lista[0] = "david";
        lista[1] = "poeta";
        lista[2] = "pelicano";
        System.out.println(lista[2]);


        ArrayList frutas = new ArrayList();
        frutas.add("manga");
        frutas.add("laranja");
        frutas.add("maçã");
        System.out.println(frutas.contains("manga")); // boolean(true neste caso)
        
        frutas.remove("manga");
        
        System.out.println(frutas);


        Cat.dingdong();
        Cat myCat = new Cat();
        myCat.name = "David";
        myCat.age = 18;
        myCat.meow();
        
        Cat anotherCat = new Cat();
        anotherCat.age = 10;
        anotherCat.name = "lol";


    }

    private static void printName(String name, int number) {
        System.out.printf("Hi, I Am %s and I have %d years old \n",name,number);
    }
}
