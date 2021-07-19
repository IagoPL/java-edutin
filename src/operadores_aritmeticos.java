public class operadores_aritmeticos {
    public static void main(String[] args) {
        //operadores aritmeticos : +,-,*,/,%
        int val1,val2,val3,val4,val5,resultado;
        
        val1=5;
        val2=200;
        val3=7;
        val4=18;
        val5=1;
        
        //suma
        resultado= val1 + val3;
        
        System.out.println("el resultado de val1 + val3 es="+resultado);
        
        //resta
        resultado= val2 - val5;
        
        System.out.println("el resultado de val2 - val5 es="+resultado);
        //multiplicacion
        resultado= val3 * val4;
        
        System.out.println("el resultado de val3 * val4 es="+resultado);
        
        //division
        resultado= val4 / val3;
        
        System.out.println("el resultado de val4 / val3 es="+resultado);
        
        //porcentaje
        resultado= val1 * val2 / 100;
        
        System.out.println("el resultado de1 5% de 4 es="+resultado);
    }
}
