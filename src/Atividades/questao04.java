package Atividades;

import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite o nome do trabalhador =>" );
    String nome = ler.nextLine();
    
    System.out.println("Digite o valor da Hora =>" );
    float  vHora = ler.nextFloat();

    System.out.println("Digite quantas horas foram trabalhadas=>" );
    float  nhorasTrab = ler. nextFloat();

    float  resultHoras = vHora * nhorasTrab;

    System.out.println("=========Calculo de horas trabalhadas =============");
    System.out.println("O trabalhador =>"+nome);
    System.out.println("recebera =>" +resultHoras);
    

    ler.close();
        
    }
}


