package Atividades;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("========== Programa Calculo de notas escolares ============");

        System.out.println("Digite a primeira nota a ser calculada ");
        double num1 = ler.nextDouble();

        System.out.println("Digite a segunda  nota a ser calculada =>");
        double num2 = ler.nextDouble();
        double soma = num1 + num2;
        double media = soma / 2;
                
        System.out.println("O resultado de nota 1 e nota 2 = "+media);

        if(media >= 7){
            System.out.println("Aluno Aprovado");
            
        }else{
            System.out.println("Aluno Reprovado");

        
            
            //ler.close();

        }
                     
    }
}
    

