public class Pez extends Animal  {
    private String alimentacion;

        
        public Pez(String especie, String alimentacion) {


            this.alimentacion = alimentacion;
        }

    public String getalimentacion(){
        return alimentacion;
    }

    public String mostrardatos() {
        return "la especie es: "+GetEspecie()+"\nla alimentacion es: "+alimentacion;
    }
}