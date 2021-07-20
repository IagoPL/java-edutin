public class arrays {
    public static void main(String[] args) {
        int [] numero = new int [10];

        System.out.println("numero sin definir: "+numero[8]);


        numero [0] = 10;
        numero [2] = 20;
        numero [3] = 30;
        numero [4] = 40;
        System.out.println("numero definido: "+numero[2]);

        int [] numeros ={10,22,34,45,54,67,72,84,99,10};

        System.out.println("array definido en una unica barra de codigo: "+numeros[ 2 ]);
    }
}
