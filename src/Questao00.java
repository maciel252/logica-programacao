import java.util.Scanner;


public class Questao00 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //nome, idade, altura, sexo
        System.out.println("Digite seu nome");
        String nome = ler. nextLine();

        System.out.println("Digite a sua idade");
        int idade = ler.nextInt();

        System.out.println("Digite a sua altura");
        float altura = ler.nextFloat();

        System.out.println("Digite o sexo");
        char sexo = ler.next().toCharArray()[0];

        ler.close();

        System.out.println("Informações Registradas");
        System.out.println("Nome:"+nome);
        System.out.println("idade:"+idade);
        System.out.println("altura:"+altura);
        System.out.println("sexo:"+sexo);
        
    }
    
}
