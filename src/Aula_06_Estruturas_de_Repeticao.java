public class Aula_06_Estruturas_de_Repeticao {
    public static void main(String[] args) {
        //while, do while, for
        int i = 0;
        while ( i <= 10){
            System.out.println(i);
            i++;
        }
        System.out.println("Passando para o Do while agora!");
        i = 12;
        do {
            System.out.println(i);
            i++;
        }while(i <= 10);
        System.out.println("Passando para o J agora!");

        for(int j = 0; j <= 10; j++){
            System.out.println(j);
        }
        //O do while executa pelo menos 1 vez antes de veririficar! Por isso o 12 foi printado  hauhauhauhauhauahuahuahauhauhzuhgb
    }
}
