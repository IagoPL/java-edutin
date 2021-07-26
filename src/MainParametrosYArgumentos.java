import javax.swing.JOptionPane;

public class MainParametrosYArgumentos {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("digitakice un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("digitakice un numero: "));

        ParametrosYArgumentos pya = new ParametrosYArgumentos();


        pya.sumar(n1,n2);
        pya.resta(n1,n2);
        pya.multiplicacion(n1,n2);
        pya.division(n1,n2);
        pya.resultado(n1,n2);



    }
}
