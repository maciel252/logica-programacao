package Atividades;

import java.util.Scanner;

public class questao06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor da conta a ser divido =>" );
        double vlConta = ler.nextDouble();

        System.out.println("Digite a quantidade de pessoas a ser divido a conta =>" );
        double qtdePessoas = ler.nextDouble();

        double resultado = vlConta / qtdePessoas;

        System.out.println("========= Calculo divisão conta pessoas========");
        System.out.println("O valor a ser dividido por pessoa será de =>"+resultado);

        ler.close();


    }
}


//6. Escreva um programa para ler o valor de uma conta e quantas pessoas vão dividir a conta,
//o sistema vai apresentar quanto cada pessoa vai pagar.