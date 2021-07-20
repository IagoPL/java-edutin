import java.util.Scanner;

public class Estructura_Switch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        System.out.println("ingrese un numero del 1 al 7: ");

        int semana = entrada.nextInt();

        String dia;

        switch (semana) {
            case 1:
                
                dia = "Lunes";

                break;
            
            case 2:
            
                dia = "Martes";

                break;

            case 3:
            
                dia = "Miercoles";

                break;
            case 4:
            
                dia = "Jueves";

                break;

            case 5:
            
                dia = "Viernes";

                break;

            case 6:
            
                dia = "Sabado";

                break;

            case 7:
            
                dia = "Domingo";

                break;

            default:

                dia = "un dia no existente, escribe un numero del 1 al 7";

                break;
        }

        System.out.println("el dia "+semana+" es "+dia);
    }
}
