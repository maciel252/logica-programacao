package Atividades;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do jantar:");
        float jantar = ler.nextFloat();
        ler.close();
        // ler.close();
        //System.out.println(jantar + " + 10% " + (jantar * 1.1));
        float gorjeta = (jantar / 100)*10;
        System.out.println(String.format("R$%.2f + 10%s =R$%.2f", jantar,"%",(gorjeta+jantar)));
    }
}

/* 5. Escreva um programa para ler o valor de um jantar, o sistema vai apresentar a taxa do garçom 10% e também o valor
<valor refeição> + 10% = <final total>.
 */