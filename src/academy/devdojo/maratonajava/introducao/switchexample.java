package academy.devdojo.maratonajava.introducao;
//control alt L para identar!
public class switchexample {
    public static void main(String[] args) {
        //imprimindo o dia da semana considerando 1 como domingo
        byte dia = 5;
        switch (dia) {
            case 1:
                System.out.println("domingo!");
                break; //Sem esse break aqui o switch ia imprimir os demais casos seguintes.
            case 2:
                System.out.println("segunda!");
                break;
            case 3:
                System.out.println("terça!");
                break;
            case 4:
                System.out.println("quarta!");
                break;
            case 5:
                System.out.println("quinta!");
                break;
            case 6:
                System.out.println("sexta!");
                break;
            case 7:
                System.out.println("sábado!");
                break;
            default: //Se nenhum dos casos for verdadeiro, esta é a opção que vai ser utilizada!
                System.out.println("opção inválida!");
                break;
        }

        char sexo = 'm';
        switch(sexo){
            case 'm':
                System.out.println("masculino!");
                break;
            case 'f':
                System.out.println("feminino!");
                break;
            default:
                System.out.println("inválido!");
        }

    }
}
