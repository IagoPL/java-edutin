import java.util.Scanner;

public class actividad_array {
    public static void main(String[] args) {
        




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

}

}