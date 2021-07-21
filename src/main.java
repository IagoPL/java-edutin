private static main;

public static void main (String[] args) {

Scanner lector = new Scanner(System.in);
int num2 = lector.nextInt();
vector =new int [10];
//para insertar un entero nuevo
insertar(num2);

//para modificar necesitas pedir el indice (num) y el numero para modificar(num2)
modificar(num,num2);

//para mostrarlos todos:
mostrarTodo();
}
private static void insertar(int num){
   for(int i=0;i<vector.length;i++){
     vector[i]=num+i;
   }


}
private static void editar(int indice, int num){
  if(indice>vector.length-1||inice<0)
    System.out.println("indice invalido");
  else
    vector[indice]=num;   
}
private static void mostrarTodo(){
  for(int i=0; i<vector.length;i++)
     System.out.println(vector[i]);
}
}