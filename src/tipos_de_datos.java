

import javax.print.event.PrintEvent;
import javax.print.event.PrintJobListener;
import javax.sound.midi.SysexMessage;
import javax.xml.transform.SourceLocator;

public class tipos_de_datos {
    public static void main(String[] args) {
        

    //Enteros
        //byte : -128/ 128
        byte bnumero=122;

        System.out.println(bnumero);

        //short : -32768/ 32767
        short snumero=32564;

        System.out.println(snumero);

        //int : -2147483648/ 2147483647
        int inumero=2147483647;

        System.out.println(inumero);

        //long : -9223372036854775808/ 9223372036854775807
        long lnumero=7;

        System.out.println(lnumero);

    //Decimales
        //float : -3.40282347E+38/ 3.40282347E+38
        float fdecimal = (float) 7.6;

        System.out.println(fdecimal);

        //double : -1.79769313486231570E+308/ 1.79769313486231570E+308
        double ddecimal = 7.9;

        System.out.println(ddecimal);

    // true or false
        //boolean  : true/ false
        boolean condicion = false;
        
        System.out.println(condicion);
        

    // texto
        //String : texto
        String palabra = "hola";

        System.out.println("la palabra es "+palabra);
        
        //char : letras
        char letras = 'j';
        
        System.out.println(letras);
    }
}
