import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("========Exemplo IO=========");
        //1. Escreva o primeiro numero.
        System.out.println("Digite um numero.");
        
        //2. Ler o numero
        Scanner ler = new Scanner(System.in);

        //ler varivael n1
        int n1 = ler.nextInt();

        //3. Escrever a mensagem "Digite outro numero"
        System.out.println("Digite outro numero");

        //ler variavel n2
        int n2 = ler.nextInt();

        //soma n1 + n2
        int r = n1 + n2;

        //exibe variavel r (n1+n2)
        System.out.println("O resultado da soma = >" +r);

        ler.close();

        
    }
}
