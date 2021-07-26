public class MetodoYContructores {
    String nombre;
    int edad;
    
    public persona (String _nombre , int _edad){
        nombre = _nombre
        edad = _edad;

    }

    public void mostrardatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("El edad es: "+edad);
    }
}