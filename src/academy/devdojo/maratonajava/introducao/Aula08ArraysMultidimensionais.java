package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais {
    public static void main(String[] args) {
       int[][] dias = new int[3][3];
       dias[0][0] = 10;
       dias[0][2] = 140;
       dias[0][1] = 5;

       for(int i=0; i< dias.length; i++){
           for (int j = 0; j<3; j++){
               System.out.println(dias[i][j]);
           }
       }
        System.out.println("FOREACH ________________________________");
       for(int[] arrBase: dias){
           for(int num:arrBase){
               System.out.println(num);
           }
       }
    }
}
