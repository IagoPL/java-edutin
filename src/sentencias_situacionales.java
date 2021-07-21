import java.util.Scanner;
import java.util.Arrays;

public class sentencias_situacionales {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("ingrese 5 numeros");

        String numerosStr = scan.nextLine();

        String cadena = numerosStr;
        String[] parts = cadena.split("|");              
        System.out.println(Arrays.asList(parts));

        System.out.println("sus siglas son: "+numerosStr.substring(4,5)+", "+numerosStr.substring(3,4)+", "+numerosStr.substring(2,3)+", "+numerosStr.substring(1,2)+", "+numerosStr.substring(0,1));
        
    }
}
