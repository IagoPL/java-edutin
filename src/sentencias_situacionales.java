import java.util.Scanner;

public class sentencias_situacionales {
    public static void main(String[] args) {
        int n;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("ingrese un numero: ");

        n = entrada.nextInt();
        
        System.out.println("ingrese un numero: ");

        if (n > 0)
        {
            System.out.println("el numero es positivo");
        }

        else 
        {
            System.out.println("el numero es negativo");
        }
    }
}
