import javax.swing.JOptionPane;


public class MainRetornoDeValores {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("digitakice un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("digitakice un numero: "));

        ParametrosYArgumentos pya = new ParametrosYArgumentos();


        int suma= pya.sumar(n1,n2);
        int resta= pya.resta(n1,n2);
        int mult= pya.multiplicacion(n1,n2);
        int div= pya.division(n1,n2);
        int result= pya.resultado(n1,n2);
    }
}   
