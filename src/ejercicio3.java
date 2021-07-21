public class ejercicio3 {
    public static void main(String[] args) {
        Object[] arreglo = new Object[5];

    arreglo[0] = 0;
    arreglo[1] = 1;
    arreglo[2] = 2;
    arreglo[3] = 3;
    arreglo[4] = 4;

    for (int i = 0; i < arreglo.length; i++) {
        Object j = arreglo[i];
        System.out.println("Arreglo Normal: " + j);
    }

    try {
        invertir (arreglo);
    } catch (Exception e) {
        System.out.println("Error: "+e.getMessage());
    }

    for (int i = 0; i < invertir.length; i++) {
        Object j = invertir [i];
        System.out.println("Arreglo invertido: " + j);
    }
    }
}
