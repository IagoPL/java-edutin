import java.util.Scanner;

public class iniciales {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombre;

        String apellido1;

        String apellido2;


        System.out.println("Por favor ingrse su nombre ");

        nombre= entrada.nextLine();

        System.out.println("ingrese el primer apellido");

        apellido1= entrada.nextLine();

        System.out.println("ingrese el segundo apellido");

        apellido2= entrada.nextLine();

        System.out.println("sus siglas son: "+nombre+". "+apellido1+". "+apellido2+".");
    }
}
