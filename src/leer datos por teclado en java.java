import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner (System.in);   
        
        int Numero;

        System.out.println("Ingrese Número");
        Numero = lector.nextInt();
        System.out.println(Numero);
    }
}
