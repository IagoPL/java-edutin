import java.util.Arrays;

public class matrices {
    public static void main(String[] args) {
        


        int x[][];
        
        x = new int [5][3];

        for (int i = 0; i < x.length; i++){
            
            for(int j = 0; j < x[i].length; j++) {
                
                x[i][j]= j+i;
            }
            System.out.println(Arrays.toString(x[i]));
        }
    }
}
