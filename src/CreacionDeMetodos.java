import javax.swing.JOptionPane;

public class CreacionDeMetodos {
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    public void LeerNumeros() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("digitalice un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("digitalice un numero: "));
}
    public void sumar() {
        suma = numero1+numero2;
    }

    public void resta() {
        resta= numero1-numero2;
    }

    public void multiplicacion() {
        multiplicacion = numero1*numero2;
        
    }

    public void division(){
        division=numero1/numero2;
    }

    public void resultado() {
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es:"+resta);
        System.out.println("la multiplicacion es: "+multiplicacion);
        System.out.println("la division es: "+division);
    }
}
