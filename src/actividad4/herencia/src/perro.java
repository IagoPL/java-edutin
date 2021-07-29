
public class perro extends Animal  {
    
    private String raza;


    public perro(String especie, String raza) {
        
        this.raza = raza;
    }

    public String getRaza(){
        return raza;
    }

    public String mostrardatos() {
        return "la especie es: "+GetEspecie()+"\nla raza es: "+raza;
    }
}
