package Atividades;

import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite o valor do jantar =>" );
    double vlJantar = ler.nextDouble();

    double taxa = vlJantar / 10;
    double total = taxa + vlJantar;

    System.out.println("=========== Valores a serem pagos com taxa garcom===========");
    System.out.println("O valor taxa garcom =>" +taxa);
    System.out.println("O valor total a ser pago sera =>" +total);

    ler.close();
    
    }
}

/* 5. Escreva um programa para ler o valor de um jantar, o sistema vai apresentar a taxa do garçom 10% e também o valor
<valor refeição> + 10% = <final total>.
 */