import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double res = 0;
        String operacion;
        boolean comprobar = false;

        do{
            
            String num1;
            
            do {
                
                System.out.println("\n Dame el primer numero de tu operacion");
                
                num1 = scan.nextLine();
            
            } while (!num1.matches("[+-]?[\\d]*[.]?[\\d]+"));
            
            double numero1 = Double.parseDouble(num1);
            double n1 = new Double(num1);

            do {System.out.println("\n escoje la operacion");
            
            operacion = scan.nextLine();

            if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x") || operacion.equals("X") || operacion.equals("/") || operacion.equals("%") || operacion.equals("*")) {

                comprobar = true;

            }
            else{
            
                comprobar = false;
            
            }

        }
        while (comprobar != true);
        
        String num2;
        
        do {
            System.out.println("\n Dame el segundo numero de la operacion");
            num2= scan.nextLine();
        } while (!num2.matches("[+-]?[\\d]*[.]?[\\d]+"));
        double numero2 = Double.parseDouble(num2);
        double n2 = new Double(num2);

        do {
            
            comprobar = true;
            switch (operacion) {
                case "+":
                
                res = n1 + n2;
                    
                    break;
                    
                case "-":
                
                res = n1 - n2;
                    
                    break;
                    

                case "/":
                while(n2 == 0){
                    do{
                        System.err.println("En el denominador se encuentra un 0, para evitar errores coloca otro numero");
                        num2 = scan.nextLine();
                    }
                        while (!num2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                        numero2 = Double.parseDouble(num2);
                        n2 =  new Double(num2);
                            
                        
                    }
                    res = n1 / n2;
                        break;

                    case "*":
                    case "x":
                    case "X":

                        res = n1 * n2;
                        break;
                    case "%":
                        while(n2 == 0){
                                do {
                                    System.err.println(" En el denominador se encuentra \n"
                                            + "un cero, para evitar errores coloca otro número.");
                                    num2 = scan.nextLine();
                                }while (!num2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                                    numero2 = Double.parseDouble(num2);
                                    n2 = new Double(numero2);
                        }
                        res = n1 % n2;
                        break;
                }
            }while(comprobar != true);

            System.out.println("(" + numero1 + ") " + operacion + " (" + numero2 + ")" + " = " + res);
            
        }while(operacion.equals("s") || operacion.equals("S"));
    }
}