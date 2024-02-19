package ficha_01;

import java.util.Scanner;

public class Exercício02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2, soma, sub, multi, divisao;

        System.out.println("Introduza um número:");
        n1 = input.nextInt();
        System.out.println("Introduza outro número");
        n2 = input.nextInt();

        soma = (n1+n2);

        System.out.println("Soma: " + soma);

        sub = (n1-n2);
        System.out.println("Subtração: " + sub);

        multi = (n1*n2);
        System.out.println("Multiplicação: " + multi);

        divisao = (n1/n2);
        System.out.println("Divisão: " + divisao);

    }

}
