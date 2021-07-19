

public class ciclo_while {
    public static void main(String[] args) {
        //ciclo while, comienza con 0 a si el numero es menor a 5 suma uno y repite

        int contador = 0;

        int limite = 5;

        while(contador < limite) { //comprieva si contador es menor a limite
            System.out.println("numero "+contador); //da el resultado del contador
            contador = contador + 1; // en caso de que el contador no sea 0 o mayor al limire suma uno al contador
        }

    }
}
