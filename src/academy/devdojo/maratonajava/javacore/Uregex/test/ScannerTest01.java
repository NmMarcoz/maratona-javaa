package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,true,200";
        Scanner scanner = new Scanner(texto.trim());
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            if(scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Inteiro: "+ i);
            } else if (scanner.hasNextBoolean()) {
                boolean j = scanner.nextBoolean();
                System.out.println("Booleano: "+ j);
            }else{
                System.out.println(scanner.next());
            }
        }
    }
}
