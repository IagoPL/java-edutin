public class Principal {
    public static void main(String[] args) {
            
        Animal misAnimales[] = new Animal[3];


        misAnimales[0] =  new Animal();
        misAnimales[1] =  new perro("pequines","perro");
        misAnimales[2] =  new Pez("placton","pez");
        

        for (Animal Animals : misAnimales){
            System.out.println(Animals.mostrardatos);
            System.out.println("");
        }
        
    }
}
