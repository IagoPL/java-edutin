public class operaciones_logicas {
    public static void main(String[] args) {
        /* obion 1 < obcion 2 menor que
        obion 1 > obcion 2 mayot que
        obion 1 == obcion 2 igual
        obion 1 <= obcion 2 menor o igual
        obion 1 >= obcion 2 mayor o igual
        */

        //mayor
        boolean mayor= (14>5);

        System.out.println(mayor);

        //mayor =
        boolean mayor_igual= (14>=14);

        System.out.println(mayor_igual);

        //menor
        boolean menor= (14<5);

        System.out.println(menor);

        //menor =
        boolean menor_igual= (14<=14);

        System.out.println(menor_igual);

        //igual
        boolean igual= (19 == 19);

        System.out.println(igual);

        //diferente
        boolean diferente= (19 != 19);

        System.out.println(diferente);

        // && equivale a un "Y"
        boolean y= ((18 < 19) && (15 < 20)); 

        System.out.println(y);

        // || equivale a un "O"
        boolean o= ((18 < 19) || (15 < 20)); 

        System.out.println(o);

    }
}
