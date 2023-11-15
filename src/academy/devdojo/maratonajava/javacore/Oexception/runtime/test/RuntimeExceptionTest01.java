package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[]args){
        //Checked e Unchecked - Termos importantes.
        //exceções checked são filhas da classe exception diretamente. Se não tratadas o seu código nem vai compilar!
        //IoException
        //SQLException
        //MalformedURLExcpetion

        //Unchecked
        //De RuntimeException para baixo temos a exceções unchecked!
        //São exceções que quando lançadas pelo programa quase 100% das vezes o problema foi tu que fez. Ou seja, corrige teu código irmão huahauhaua
        //Não são de tratamento obrigatório

        int [] nums = {1,2};
        System.out.println(nums[2]); // Runtime exception
    }
}
