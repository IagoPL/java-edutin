import javax.swing.JOptionPane;

public class RetornoDeValores {
    public static void main(String[] args) {
        RetornoDeValores cdm = new RetornoDeValores();


        cdm.LeerNumeros();
        cdm.suma();
        cdm.resta();
        cdm.multiplicacion();
        cdm.division();
        cdm.resultado();
    }

    public void LeerNumeros(int  numero1, int numero2) {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("digitalice un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("digitalice un numero: "));
}
    public void sumar(int  numero1, int numero2) {
        suma = numero1+numero2;
    }

    public void resta(int  numero1, int numero2) {
        resta= numero1-numero2;
    }

    public void multiplicacion(int  numero1, int numero2) {
        multiplicacion = numero1*numero2;
        
    }

    public void division(int  numero1, int numero2){
        division=numero1/numero2;
    }

    public void resultado(int  numero1, int numero2) {
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es:"+resta);
        System.out.println("la multiplicacion es: "+multiplicacion);
        System.out.println("la division es: "+division);
    }
}
