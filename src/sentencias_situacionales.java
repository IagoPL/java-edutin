import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
import java.lang.*;
public class sentencias_situacionales {
    public static void main(String[] args) {
        
/*

        String cadena="hola como estas";
        String [] array=cadena.split(" ");
        String invertido="";
        for(int i=array.length-1;i>=0; i--){

            invertido=invertido+" "+array[i];
        }
        System.out.println(invertido);
*/



Scanner scan = new Scanner (System.in);
        System.out.println("ingrese 5 numeros separados por comas");

        String numerosStr = scan.nextLine();

        String cadena = numerosStr;


        String [] array=cadena.split(",");
        String invertido="";
        for(int i=array.length-1;i>=0; i--){

            invertido=invertido+" "+array[i];
        }
        System.out.println(invertido);
/*
        Scanner scan = new Scanner (System.in);
        System.out.println("ingrese 5 numeros separados por comas");

        String numerosStr = scan.nextLine();

        String cadena = numerosStr;
        String str = cadena;
        String[] arrOfStr = str.split(",");

        for (String a : arrOfStr)
            System.out.println(a);
*/
}
/*
        String numerosStr = scan.nextLine();

        String cadena = numerosStr;
        String[] parts = cadena.split("|");              
        System.out.println(Arrays.asList(parts));

        System.out.println("sus siglas son: "+numerosStr.substring(4,5)+", "+numerosStr.substring(3,4)+", "+numerosStr.substring(2,3)+", "+numerosStr.substring(1,2)+", "+numerosStr.substring(0,1));
        
    }
}*/
}