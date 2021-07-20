import java.util.Scanner;

public class ciclo_do_while {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        //definimos variables
        int n;


        int c = 0;
        
        System.out.println("ingrse un numero");

        n = entrada.nextInt(); //definimos que n sea igual al numero de entrada
        do{

            System.out.println(c+"."); //damos contador como resultado

            c++; //sumamos uno al contador

        } 
        
        while( c < n ); // en caso de que c sea menor a n repetiremos la accion
        




        int pares;
        
        System.out.println("ingrese un numero:" );

        n = entrada.nextInt();

        do{

            pares= 2 * c - 2;

            System.out.println(pares+".");

            c++;

        }
    while (c <= n); 



        
        int s = 0;

        int d;

        System.out.println("Ingrese un numero:" );

        n= entrada.nextInt();
        do {

            d= n % 10;

            s= s + d;

            n= n / 10;

        } while (n > 0);

        System.out.println(" La suma de los digitos es: "+s);
    }
}
